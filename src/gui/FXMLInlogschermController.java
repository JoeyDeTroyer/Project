package gui;

import DAO.LeerlingDAO;
import Models.Leerling;
import java.io.IOException;
import java.util.Optional;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import project.Model;

public class FXMLInlogschermController extends BorderPane 
{
    @FXML
    private Button btnNieuw, btnVerwijder, btnZoeken, btnLogin;       
   
    @FXML
    private ListView<Leerling> lstGebruikers;
    
    
    ScreenSwitcher switcher;
    
    public FXMLInlogschermController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInlogscherm.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void nieuw()
    {
        switcher.nieuw();
        btnVerwijder.setDisable(false);
    }
    
    @FXML
    public void verwijder()
    {
        if(lstGebruikers.getSelectionModel().getSelectedItem() == null)
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Opgelet");
            alert.setHeaderText(null);
            alert.setContentText("U heeft niemand geselecteerd.");
            alert.showAndWait();
        }
        else
        {
            Leerling l = lstGebruikers.getSelectionModel().getSelectedItem();
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Leerling verwijderen");
            alert.setHeaderText(null);
            alert.setContentText("Wilt u " + l.getNaamVoornaam() + " verwijderen?");

            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK)
            {
                Model.getInstance().getLeerlingen().remove(l);
                LeerlingDAO.getInstance().verwijderLeerling(l.getInschrijvingsNr());
                initialize();
            }
            else
            {

            }
        }
    }

    
    public void initialize() 
    {
        
        lstGebruikers.setItems(Model.getInstance().getLeerlingen());
        lstGebruikers.setCellFactory(new Callback<ListView<Leerling>, ListCell<Leerling>>() {
            @Override
            public ListCell<Leerling> call(ListView<Leerling> p) {
                return new LeerlingCell();
            }
        });
        
        if(Model.getInstance().getLeerlingen().isEmpty())
        {
            btnVerwijder.setDisable(true);
        }
        
    }
}