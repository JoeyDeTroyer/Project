package Models;

import java.awt.Image;

public class Leerling {
    private String inschrijvingsNr;
    private String voorNaam;
    private String naam;
    private String email;
    private Image foto;
    
    public String getInschrijvingsNr() {
        return inschrijvingsNr;
    }
    
    public void setInschrijvingsNr(String inschrijvingsNr) {
        this.inschrijvingsNr = inschrijvingsNr;
    }
     public String getVoorNaam() {
        return voorNaam;
    }
     
    public void setVoorNaam(String voornaam) {
        this.voorNaam = voornaam;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
   
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Leerling(String inschrijvingsNr, String voorNaam, String naam, 
            String email) {
        this.setInschrijvingsNr(inschrijvingsNr);
        this.setVoorNaam(voorNaam);
        this.setNaam(naam);
        this.setEmail(email);
    }
    
}
