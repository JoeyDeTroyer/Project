package gui;

import DAO.LeerlingDAO;
import Models.Leerling;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.LabelBuilder;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import project.Model;

public class FXMLNieuweLeerlingToevoegenController extends BorderPane
{
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
    
    ScreenSwitcher switcher;
    
    public FXMLNieuweLeerlingToevoegenController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLNieuweLeerlingToevoegen.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void annuleer()
    {
        switcher.logout();
    }
    
        public void saveAction() {
        // Create a new group, or update the existing one.
            Leerling leerling = new Leerling();
            leerling.setInschrijvingsNr(Integer.parseInt(txtInschrijvingsnummer.getText()));
            leerling.setNaam(txtNaam.getText().trim());
            leerling.setVoorNaam(txtVoornaam.getText().trim());
            leerling.setEmail(txtEmail.getText().trim());
            LeerlingDAO.getInstance().addLeerling(leerling);
        }
            
        
}
