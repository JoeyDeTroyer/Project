/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import DAO.LeerlingDAO;
import Models.Leerling;
import gui.ScreenSwitcher;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Project extends Application {
    
    public int idProject;
    
    @Override
    public void start(Stage primaryStage) 
    {
      Model.getInstance().initialize();
      primaryStage.setTitle("Rijschool Paul");
      ScreenSwitcher screen = new ScreenSwitcher();
      screen.logout();
      Scene scene = new Scene(screen);
      primaryStage.setScene(scene);
      primaryStage.show();
      
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
