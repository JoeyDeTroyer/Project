package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_Volgafstand 
{
    private int volgafstand;
    private int zijdelings;
    private int volgafstandAndere;

    public Verkeerstechniek_Volgafstand() 
    {
        
    }

    public Verkeerstechniek_Volgafstand(int volgafstand, int zijdelings, int volgafstandAndere) {
        this.volgafstand = volgafstand;
        this.zijdelings = zijdelings;
        this.volgafstandAndere = volgafstandAndere;
    }
    
    

    public int getVolgafstand() {
        return volgafstand;
    }

    public void setVolgafstand(int volgafstand) {
        this.volgafstand = volgafstand;
    }

    public int getZijdelings() {
        return zijdelings;
    }

    public void setZijdelings(int zijdelings) {
        this.zijdelings = zijdelings;
    }

    public int getVolgafstandAndere() {
        return volgafstandAndere;
    }

    public void setVolgafstandAndere(int volgafstandAndere) {
        this.volgafstandAndere = volgafstandAndere;
    }

    
}