package Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "Leerling.findAll", query = "SELECT l FROM Leerling l")
})
public class Leerling {

    private String voorNaam;
    private String naam;
    private String email;

    @Id
    private int inschrijvingsNr;

    public int getInschrijvingsNr() {
        return inschrijvingsNr;
    }

    public void setInschrijvingsNr(int inschrijvingsNr) {
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

    public String getNaamVoornaam() {
        return this.inschrijvingsNr + " - " + this.voorNaam + " " + this.naam;
    }

    public String getVolledigeNaam() {
        return this.voorNaam + " " + this.naam;
    }
}
