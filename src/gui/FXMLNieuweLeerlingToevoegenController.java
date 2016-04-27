package gui;

import DAO.LeerlingDAO;
import Models.Leerling;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML
    private Label lblFoutmelding;
    
    
    
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
        lblFoutmelding.setWrapText(true);
    }
    
    @FXML
    public void annuleer()
    {
        switcher.logout();
    }
    
    
    
        public void saveAction() 
        {
            if ( txtInschrijvingsnummer.getText().trim().length() == 0 ) {
                lblFoutmelding.setText("Inschrijvingsnummer is niet ingevuld!");}
            for (Leerling l : LeerlingDAO.getInstance().findAllLeerlingen())
            {
                if(l.getInschrijvingsNr() == Integer.parseInt(txtInschrijvingsnummer.getText().trim()))
                {
                    lblFoutmelding.setText("Er bestaat al een leerling met dit inschrijvingsnummer!");
                }
            }
            if ( txtNaam.getText().trim().length() == 0 ) {
                lblFoutmelding.setText("Naam is niet ingevuld!");}
            if ( txtVoornaam.getText().trim().length() == 0 ) {
                lblFoutmelding.setText("Voornaam is niet ingevuld!");}
            if ( txtEmail.getText().trim().length() == 0 ) {
                lblFoutmelding.setText("Email adres is niet ingevuld!");} 
            else
            {
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
