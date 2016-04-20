package gui;

import DAO.RijtechniekDAO;
import Models.Configuratie;
import Models.Rijtechniek.Rijtechniek_Keren;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class FXMLKerenController extends BorderPane {

    @FXML
    Button btnTerug;
    
    @FXML
    RadioButton eenbeweging1, eenbeweging2, eenbeweging3;

    @FXML
    ToggleGroup In_1_beweging;

    ScreenSwitcher switcher;

    public FXMLKerenController(ScreenSwitcher switcher) {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLKeren.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Rijtechniek_Keren keren = new Rijtechniek_Keren();
        
        eenbeweging1.setToggleGroup(In_1_beweging);
        eenbeweging2.setToggleGroup(In_1_beweging);
        eenbeweging3.setToggleGroup(In_1_beweging);
        
//        switch(keren.getKeren()) {
//            case 1:
//                 In_1_beweging.selectToggle(eenbeweging1);
//            case 2:
//                 In_1_beweging.selectToggle(eenbeweging2);
//            case 3:
//                 In_1_beweging.selectToggle(eenbeweging3);
//            default:
//                In_1_beweging.selectToggle(eenbeweging1);}
         
        
        In_1_beweging.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
        
                if (eenbeweging1.isSelected() == true){
                    keren.setKeren(1);
                } else if (eenbeweging2.isSelected() == true) {
                    keren.setKeren(2);  
                } else {
                    keren.setKeren(3);
                }
                
                Configuratie.evaluatie.getRijtechniek().setKeren(keren);
//                System.out.println(Configuratie.evaluatie.getRijtechniek().getKeren().getKeren());
                RijtechniekDAO.getInstance().updateRijtechniek(Configuratie.evaluatie.getRijtechniek());
                        
//              System.out.println(In_1_beweging.getSelectedToggle().getToggleGroup().getSelectedToggle().toString());
//              if (In_1_beweging.getSelectedToggle() != null) {

//                    System.out.println(In_1_beweging.getSelectedToggle().getUserData().toString());
                    // Do something here with the userData of newly selected radioButton

//                }
            }
        });
    }
    @FXML
    public void rijtechniek() {
        switcher.rijtechniek();
    }
}
