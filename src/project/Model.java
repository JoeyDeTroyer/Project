package project;

import DAO.DashboardDAO;
import DAO.LeerlingDAO;
import Models.Rijtechniek.Rijtechniek; 
import DAO.RijtechniekDAO;
import DAO.VerkeerstechniekDAO;
import Models.Dashboard.Dashboard;
import Models.Leerling;
import Models.Verkeerstechniek.Verkeerstechniek;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Model {
    public void initialize() {
        
        rijtechnieken = FXCollections.observableArrayList(RijtechniekDAO.getInstance().findAllRijtechnieken());
        leerlingen = FXCollections.observableArrayList(LeerlingDAO.getInstance().findAllLeerlingen());
        verkeerstechnieken = FXCollections.observableArrayList(VerkeerstechniekDAO.getInstance().findAllVerkeerstechnieken()); 
        dashboards = FXCollections.observableArrayList(DashboardDAO.getInstance().findAllDashboards()); 
    }
    
    private ObservableList<Rijtechniek> rijtechnieken;

    public ObservableList<Rijtechniek> getRijtechnieken() {
        return rijtechnieken;
    }
    
    private ObservableList<Leerling> leerlingen;

    public ObservableList<Leerling> getLeerlingen() {
        return leerlingen;
    }
    
    private ObservableList<Verkeerstechniek> verkeerstechnieken;

    public ObservableList<Verkeerstechniek> getVerkeerstechnieken() {
        return verkeerstechnieken;
    }
    
    private ObservableList<Dashboard> dashboards;

    public ObservableList<Dashboard> getDashboards() {
        return dashboards;
    }
    
    private Model() {}
    
    private static final Model instance = new Model();

    public static Model getInstance() {
        return instance;
    }
    
}
