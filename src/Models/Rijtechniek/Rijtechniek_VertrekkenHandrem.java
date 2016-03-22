package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_VertrekkenHandrem {
    
    private int vertrekkenHandrem;

    public int getVertrekkenHandrem() {
        return vertrekkenHandrem;
    }

    public void setVertrekkenHandrem(int vertrekkenHandrem) {
        this.vertrekkenHandrem = vertrekkenHandrem;
    }

    public Rijtechniek_VertrekkenHandrem() 
    {
        
    }

    public Rijtechniek_VertrekkenHandrem(int vertrekkenHandrem) 
    {
        this.vertrekkenHandrem = vertrekkenHandrem;
    }
}
