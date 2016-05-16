package gui;

import DAO.LeerlingDAO;
import Models.Leerling;
import java.io.IOException;
import java.util.Optional;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import project.Model;

public class FXMLNieuweLeerlingToevoegenController extends BorderPane {

    @FXML
    Button btnAnnuleer;

    @FXML
    private TextField txtInschrijvingsnummer;
    @FXML
    private TextField txtNaam;
    @FXML
    private TextField txtVoornaam;
    @FXML
    private TextField txtEmail;
    @FXML
    private Label lblFoutmelding;

    ScreenSwitcher switcher;

    public FXMLNieuweLeerlingToevoegenController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLNieuweLeerlingToevoegen.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        lblFoutmelding.setWrapText(true);
    }

    @FXML
    public void annuleer() {
        switcher.logout();
    }

    public void saveAction() {
        if (txtInschrijvingsnummer.getText().trim().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Inschrijvingsnummer is niet ingevuld");
            alert.setHeaderText(null);
            alert.setContentText("Het inschrijvingsnummer is niet ingevuld.");
            Optional<ButtonType> result = alert.showAndWait();
        }
        for (Leerling l : LeerlingDAO.getInstance().findAllLeerlingen()) {
            if (l.getInschrijvingsNr() == Integer.parseInt(txtInschrijvingsnummer.getText().trim())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Inschrijvingsnummer bestaat al");
                alert.setHeaderText(null);
                alert.setContentText("Er bestaat al een leerling met dit inschrijvingsnummer.");
                Optional<ButtonType> result = alert.showAndWait();
            }
        }
        if (txtNaam.getText().trim().length() < 2) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Niet alle gegevens zijn ingevuld");
            alert.setHeaderText(null);
            alert.setContentText("De naam is niet ingevuld");
            Optional<ButtonType> result = alert.showAndWait();
        } else if (txtVoornaam.getText().trim().length() < 2) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Niet alle gegevens zijn ingevuld");
            alert.setHeaderText(null);
            alert.setContentText("De voornaam is niet ingevuld");
            Optional<ButtonType> result = alert.showAndWait();
        } else if (txtEmail.getText().trim().length() == 0) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Niet alle gegevens zijn ingevuld");
            alert.setHeaderText(null);
            alert.setContentText("Het email adres i niet ingevuld..");
            Optional<ButtonType> result = alert.showAndWait();
        } else {
            Leerling leerling = new Leerling();
            leerling.setInschrijvingsNr(Integer.parseInt(txtInschrijvingsnummer.getText()));
            leerling.setNaam(txtNaam.getText().trim());
            leerling.setVoorNaam(txtVoornaam.getText().trim());
            leerling.setEmail(txtEmail.getText().trim());
            LeerlingDAO.getInstance().addLeerling(leerling);
            LeerlingDAO.getInstance().findAllLeerlingen();
            Model.getInstance().initialize();
            switcher.logout();
        }
    }
}
