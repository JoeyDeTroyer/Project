package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_ProgressBar {
    
    private int progressBar;

    public int getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(int progressBar) {
        this.progressBar = progressBar;
    }  
}
