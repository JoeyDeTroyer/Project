package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_ProgressBar {
    
    private double progressBar;

    public double getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(double progressBar) {
        this.progressBar = progressBar;
    }  
}
