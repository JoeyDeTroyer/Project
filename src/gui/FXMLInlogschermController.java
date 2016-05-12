package gui;

import DAO.LeerlingDAO;
import Models.Configuratie;
import Models.Leerling;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import project.Model;

public class FXMLInlogschermController extends BorderPane {

    @FXML
    private Button btnNieuw, btnZoeken, btnLogin;

    @FXML
    private ListView<Leerling> lstGebruikers;

    @FXML
    private TextField txtNaam, txtInschrijving;

    private LeerlingDAO leerlingdao;

    ObservableList<Leerling> leerlingen = FXCollections.observableArrayList();

    ScreenSwitcher switcher;

    public FXMLInlogschermController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInlogscherm.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        LeerlingDAO.getInstance().findAllLeerlingen();
        Model.getInstance().initialize();
    }
    @FXML
    public void nieuw() {
        switcher.nieuw();
//        btnVerwijder.setDisable(false);
    }

    public void login() {
        Leerling l = lstGebruikers.getSelectionModel().getSelectedItem();
        Configuratie.setLeerling(l);
        switcher.dashboard();

    }

//    @FXML
//    public void verwijder() {
//        if (lstGebruikers.getSelectionModel().getSelectedItem() == null) {
//            Alert alert = new Alert(AlertType.INFORMATION);
//            alert.setTitle("Opgelet");
//            alert.setHeaderText(null);
//            alert.setContentText("U heeft niemand geselecteerd.");
//            alert.showAndWait();
//        } else {
//            Leerling l = lstGebruikers.getSelectionModel().getSelectedItem();
//            Alert alert = new Alert(AlertType.CONFIRMATION);
//            alert.setTitle("Leerling verwijderen");
//            alert.setHeaderText(null);
//            alert.setContentText("Wilt u " + l.getNaamVoornaam() + " verwijderen?");
//
//            Optional<ButtonType> result = alert.showAndWait();
//            if (result.get() == ButtonType.OK) {
//                Model.getInstance().getLeerlingen().remove(l);
//                LeerlingDAO.getInstance().verwijderLeerling(l.getInschrijvingsNr());
//                initialize();
//            } else {
//
//            }
//        }
//    }

    @FXML
    public void initialize() {

        lstGebruikers.setItems(Model.getInstance().getLeerlingen());
        lstGebruikers.setCellFactory(new Callback<ListView<Leerling>, ListCell<Leerling>>() {
            @Override
            public ListCell<Leerling> call(ListView<Leerling> p) {
                return new LeerlingCell();
            }
        });

//        if (Model.getInstance().getLeerlingen().isEmpty()) {
//            btnVerwijder.setDisable(true);
//        }

    }

    @FXML
    public void zoeken() {

        if (txtNaam.getText().isEmpty() || txtNaam.getText() == null || "".equals(txtNaam.getText())) {
            //reset list to show all items
            leerlingen.addAll(Model.getInstance().getLeerlingen());
            ObservableList<Leerling> resultaatZoeken = FXCollections.observableArrayList();

            leerlingen.stream().forEach((l) -> {
                resultaatZoeken.add(l);
            });
            lstGebruikers.getItems().clear();
            lstGebruikers.setItems(resultaatZoeken);
            lstGebruikers.setCellFactory((ListView<Leerling> p) -> new LeerlingCell());

        } else {
            // reset list in case of mistake and searching again         
            leerlingen.addAll(Model.getInstance().getLeerlingen());

            ObservableList<Leerling> resultaatZoeken = FXCollections.observableArrayList();

            leerlingen.stream().filter((l) -> (l.getNaamVoornaam().toLowerCase().contains(txtNaam.getText().toLowerCase().trim()))).forEach((l) -> {
                resultaatZoeken.add(l);
            });
            lstGebruikers.getItems().clear();
            lstGebruikers.setItems(resultaatZoeken);
            lstGebruikers.setCellFactory((ListView<Leerling> p) -> new LeerlingCell());

        }
    }

}
