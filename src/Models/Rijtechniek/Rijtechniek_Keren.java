package Models.Rijtechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Rijtechniek_Keren {
    
    private int keren;
    private int kerenEenBeweging;
    private int kerenDrieBewegingen;
    private int kerenAchterwaarts;

    public int getKeren() {
        return keren;
    }

    public void setKeren(int keren) {
        this.keren = keren;
    }

    public int getKerenEenBeweging() {
        return kerenEenBeweging;
    }

    public void setKerenEenBeweging(int kerenEenBeweging) {
        this.kerenEenBeweging = kerenEenBeweging;
    }

    public int getKerenDrieBewegingen() {
        return kerenDrieBewegingen;
    }

    public void setKerenDrieBewegingen(int kerenDrieBewegingen) {
        this.kerenDrieBewegingen = kerenDrieBewegingen;
    }

    public int getKerenAchterwaarts() {
        return kerenAchterwaarts;
    }

    public void setKerenAchterwaarts(int kerenAchterwaarts) {
        this.kerenAchterwaarts = kerenAchterwaarts;
    }

//    public Rijtechniek_Keren() 
//    {
//        
//    }
//
//    public Rijtechniek_Keren(int keren, int kerenEenBeweging, int kerenDrieBewegingen, int kerenAchterwaarts) 
//    {
//        this.keren = keren;
//        this.kerenEenBeweging = kerenEenBeweging;
//        this.kerenDrieBewegingen = kerenDrieBewegingen;
//        this.kerenAchterwaarts = kerenAchterwaarts;
//    }
    
}
