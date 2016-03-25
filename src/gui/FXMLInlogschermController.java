package gui;

import DAO.LeerlingDAO;
import Models.Leerling;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
        Leerling l = lstGebruikers.getSelectionModel().getSelectedItem();
        Model.getInstance().getLeerlingen().remove(l);
        LeerlingDAO.getInstance().verwijderLeerling(l.getInschrijvingsNr());
        initialize();
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