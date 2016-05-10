package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Stuuroefening {
    
    private int stuuroefening;

    public int getStuuroefening() {
        return stuuroefening;
    }

    public void setStuuroefening(int stuuroefening) {
        this.stuuroefening = stuuroefening;
    }
    
    
    
}
