package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_VertrekkenVoetrem {
    
    private int vertrekkenVoetrem;

    public int getVertrekkenVoetrem() {
        return vertrekkenVoetrem;
    }

    public void setVertrekkenVoetrem(int vertrekkenVoetrem) {
        this.vertrekkenVoetrem = vertrekkenVoetrem;
    }

    public Rijtechniek_VertrekkenVoetrem() 
    {
        
    }

    public Rijtechniek_VertrekkenVoetrem(int vertrekkenVoetrem) 
    {
        this.vertrekkenVoetrem = vertrekkenVoetrem;
    }
}
