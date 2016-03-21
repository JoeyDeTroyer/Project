package gui;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class FXMLAttitudeController extends BorderPane
{
    ObservableList<String> values = FXCollections.observableArrayList("Concentratie","Zenuwachtig","Schrik","Asociaal","Verkeersgevaarlijk","Ongeduldig","Aggresief","Inzet","Verstrooid","Eigenwijs");
    ObservableList<String> valuesLeerling = FXCollections.observableArrayList();
    
    @FXML
    Button btnHome, btnLeft, btnRight, btnToevoegen;
    @FXML
    ListView listView1, listView2;
    @FXML
    TextField txtToevoegen;
    
    ScreenSwitcher switcher;
    
    public FXMLAttitudeController(ScreenSwitcher switcher)
    {
        this.switcher = switcher;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAttitude.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try 
        {
            loader.load();
        } catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
        listView1.setItems(FXCollections.observableList(values));
    }
    
    @FXML
    public void dashboard()
    {
        switcher.dashboard();
    }

    //TO DO: Code voor duplicaten niet toe te staan
    @FXML
    public void toevoegen()
    {
        ObservableList valuesTemp = listView2.getItems();
        if("".equals(txtToevoegen.getText()))
        {
            //Foutcode te implementeren
            listView2.setItems(valuesTemp);
        }
        else
        {
            if(listView2.getItems() == null)
            {
                valuesLeerling.add(txtToevoegen.getText());
                listView2.setItems(valuesLeerling);
                txtToevoegen.clear();
            }
            else
            {
                valuesTemp.add(txtToevoegen.getText());
                listView2.setItems(valuesTemp);
                txtToevoegen.clear();
            }
        }
    }
    // TO DO: Code voor duplicaten niet toe te staan
    @FXML
    public void right()
    {
        ObservableList valuesTemp = listView2.getItems();
        if(listView1.getSelectionModel().getSelectedItem() == null)
        {
            
        }
        else if(listView2.getItems() == null)
        {
            listView2.setItems(listView1.getSelectionModel().getSelectedItems());
        }
        else
        {
            //for(int i=0; i < valuesTemp.size(); i++)
            //{
                if(listView2.getSelectionModel().getSelectedItems().contains(listView1.getSelectionModel().getSelectedItems()) == true)
                {
                    listView1.getItems().remove(listView1.getSelectionModel().getSelectedItem());
                }
                else
                {
                    valuesTemp.add(listView1.getSelectionModel().getSelectedItem());
                    listView1.getItems().remove(listView1.getSelectionModel().getSelectedIndex());
                    listView2.setItems(valuesTemp);
                }
            //}    
        }
    }
    // TO DO: Code voor duplicaten niet toe te staan
    @FXML
    public void left()
    {
        ObservableList valuesTemp = listView1.getItems();
        if(listView2.getSelectionModel().getSelectedItem() == null)
        {
            
        }
        else if(listView1.getItems() == null)
        {
            listView1.setItems(listView2.getSelectionModel().getSelectedItems());
        }
        else
        {
            if(listView1.getSelectionModel().getSelectedItems().contains(listView2.getSelectionModel().getSelectedItems()) == true)
            {
                listView2.getItems().remove(listView2.getSelectionModel().getSelectedIndex());
            }
            else
            {
                valuesTemp.add(listView2.getSelectionModel().getSelectedItem());
                listView2.getItems().remove(listView2.getSelectionModel().getSelectedIndex());
                listView1.setItems(valuesTemp);
            }
        }
    }
}