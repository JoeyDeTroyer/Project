package Models;

public class Rijtechniek {
    //Attributen voor zithouding
    private int zithouding;
    private int zithoudingZithouding;
    private int zithoudingGordels;
    private int zithoudingSpiegels;
    private int zithoudingHandrem;
    private int zithoudingAndere;
    
    //Attributen voor koppeling
    private int koppeling;
    
    //Attributen voor remTechniek
    private int remTechniek;
    
    //Attributen voor stuurTechniek
    private int stuurTechniek;
    
    //Attributen voor schakelTechniek
    private int schakelTechniek;
    
    //Attributen voor kijkTechniek
    private int kijkTechniek;
    private int kijkTechniekVergewissen;
    private int kijkTechniekSpiegels;
    private int kijkTechniekDodeHoek;
    private int kijkTechniekVerGenoeg;
    private int kijkTechniekSelecteren;
    private int kijkTechniekAndere;
    
    
    private int vertrekkenHelling;
    private int vertrekkenVoetrem;
    private int vertrekkenHandrem;
    private int balanceren;
    
    //Attributen voor keren
    private int keren;
    private int kerenEenBeweging;
    private int kerenDrieBewegingen;
    private int kerenAchterwaarts;
    
    //Attributen voor parkeren
    private int parkeren;
    private int parkerenTweeVoertuigen;
    private int parkerenAchterVoertuigen;
    private int parkerenLinks;
    
    //Bijhouden van int met waarde 1(goed), 2(niet gekend), 3(niet gezien)
    private int getZithouding() {
        return zithouding;
    }
    
    public void setZithouding(int zithouding) {
        this.zithouding = zithouding;
    }
    
    private int getZithoudingZithouding() {
        return zithoudingZithouding;
    }
    
    public void setZithoudingZithouding(int zithoudingZithouding) {
        this.zithoudingZithouding = zithoudingZithouding;
    }
    
    private int getZithoudingGordels() {
        return zithoudingGordels;
    }
    
    public void setZithoudingGordels(int zithoudingGordels) {
        this.zithoudingGordels = zithoudingGordels;
    }
    
    private int getZithoudingSpiegels() {
        return zithoudingSpiegels;
    }
    
    public void setZithoudingSpiegels(int zithoudingSpiegels) {
        this.zithoudingSpiegels = zithoudingSpiegels;
    }
    
    private int getZithoudingHandrem() {
        return zithoudingHandrem;
    }
    
    public void setZithoudingHandrem(int zithoudingHandrem){
        this.zithoudingHandrem = zithoudingHandrem;
    }
    
    private int getZithoudingAndere() {
        return zithoudingAndere;
    }
    
    public void setZithoudingAndere(int zithoudingAndere){
        this.zithoudingAndere = zithoudingAndere;
    }
    
    private int getKoppeling() {
        return koppeling;
    }
    
    public void setKoppeling(int koppeling) {
        this.koppeling = koppeling;
    }
    
    private int getRemTechniek() {
        return remTechniek;
    }
    
    public void setRemTechniek(int remTechniek) {
        this.remTechniek = remTechniek;
    }
    
    private int getStuurTechniek() {
        return stuurTechniek;
    }
    
    public void setStuurTechniek(int stuurTechniek) {
        this.stuurTechniek = stuurTechniek;
    }
    
    private int getSchakelTechniek() {
        return schakelTechniek;
    }
    
    public void setSchakelTechniek(int schakelTechniek) {
        this.schakelTechniek = schakelTechniek;
    }
    
    private int getKijkTechniek() {
        return kijkTechniek;
    }
    
    public void setKijkTechniek(int kijkTechniek) {
        this.kijkTechniek = kijkTechniek;
    }
    
    private int getKijkTechniekVergewissen() {
        return kijkTechniekVergewissen;
    }
    
    public void setKijkTechniekVergewissen(int kijkTechniekVergewissen) {
        this.kijkTechniekVergewissen = kijkTechniekVergewissen;
    }
    
    private int getKijkTechniekSpiegels() {
        return kijkTechniekSpiegels;
    }
    
    public void setKijkTechniekSpiegels(int kijkTechniekSpiegels) {
        this.kijkTechniekSpiegels = kijkTechniekSpiegels;
    }
    
    private int getKijkTechniekDodeHoek() {
        return kijkTechniekDodeHoek;
    }
    
    public void setKijkTechniekDodeHoek(int kijkTechniekDodeHoek) {
        this.kijkTechniekDodeHoek = kijkTechniekDodeHoek;
    }
    
    private int getKijkTechniekVerGenoeg() {
        return kijkTechniekVerGenoeg;
    }
    
    public void setKijkTechniekVerGenoeg(int kijkTechniekVerGenoeg) {
        this.kijkTechniekVerGenoeg = kijkTechniekVerGenoeg;
    }
    
    private int getKijkTechniekSelecteren() {
        return kijkTechniekSelecteren;
    }
    
    public void setKijkTechniekSelecten(int kijkTechniekSelecteren) {
        this.kijkTechniekSelecteren = kijkTechniekSelecteren;
    }
    
    private int getKijkTechniekAndere() {
        return kijkTechniekAndere;
    }
    
    public void setKijkTechniekAndere(int kijkTechniekAndere) {
        this.kijkTechniekAndere = kijkTechniekAndere;
    }
    
    private int GetVertrekkenHelling() {
        return vertrekkenHelling;
    }
    
    public void setVertrekkenHelling(int vertrekkenHelling) {
        this.vertrekkenHelling = vertrekkenHelling;
    }
    
    private int getVertrekkenVoetrem() {
        return vertrekkenVoetrem;
    }
    
    public void setVertrekkenVoetrem(int vertrekkenVoetrem) {
        this.vertrekkenVoetrem = vertrekkenVoetrem;
    }
    
    private int getVertrekkenHandrem() {
        return vertrekkenHandrem;
    }
    
    public void setVertrekkenHandrem(int vertrekkenHandrem) {
        this.vertrekkenHandrem = vertrekkenHandrem;
    }
    
    private int getBalanceren() {
        return balanceren;
    }
    
    public void setBalanceren(int balanceren) {
        this.balanceren = balanceren;
    }
    
    private int getKeren() {
        return keren;
    }
    
    public void setKeren(int keren) {
        this.keren = keren;
    }
    
    private int getKerenEenBeweging() {
        return kerenEenBeweging;
    }
    
    public void setKerenEenBeweging(int kerenEenBeweging) {
        this.kerenEenBeweging = kerenEenBeweging;
    }
    
    private int getKerenDrieBewegingen() {
        return kerenDrieBewegingen;
    }
    
    public void setKerenDrieBewegingen(int kerenDrieBewegingen) {
        this.kerenDrieBewegingen = kerenDrieBewegingen;
    }
    
    private int getKerenAchterwaarts() {
        return kerenAchterwaarts;
    }
    
    public void setKerenAchterwaarts(int kerenAchterwaarts)  {
        this.kerenAchterwaarts = kerenAchterwaarts;
    }
    
    private int getParkeren(){
        return parkeren;
    }
    
    public void setParkeren(int parkeren) {
        this.parkeren = parkeren;
    }
    
    private int getParkerenTweeVoertuigen(){
        return parkerenTweeVoertuigen;
    }
     
    public void setParkerenTweeVoertuigen(int parkerenTweeVoertuigen) {
        this.parkerenTweeVoertuigen = parkerenTweeVoertuigen;
    }
     
    private int getParkerenAchterVoertuigen(){
        return parkerenAchterVoertuigen;
    }
      
    public void setParkerenAchterVoertuigen(int parkerenAchterVoertuigen) {
        this.parkerenAchterVoertuigen = parkerenAchterVoertuigen;
    }
      
    private int getParkerenLinks(){
        return parkerenLinks;
    }
       
    public void setParkerenLinks(int parkerenLinks) {
        this.parkerenLinks = parkerenLinks;
    }
    
}
