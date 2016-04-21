package Models.Dashboard;

import javax.persistence.Embeddable;

@Embeddable
public class Dashboard_TypesOpenbareWeg {
    
    private int rotonde;
    private int rijstroken;
    private int stad;
    private int autosnelweg;

    public int getRotonde() {
        return rotonde;
    }

    public void setRotonde(int rotonde) {
        this.rotonde = rotonde;
    }

    public int getRijstroken() {
        return rijstroken;
    }

    public void setRijstroken(int rijstroken) {
        this.rijstroken = rijstroken;
    }

    public int getStad() {
        return stad;
    }

    public void setStad(int stad) {
        this.stad = stad;
    }

    public int getAutosnelweg() {
        return autosnelweg;
    }

    public void setAutosnelweg(int autosnelweg) {
        this.autosnelweg = autosnelweg;
    }  
}
