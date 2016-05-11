package Models.Verkeerstechniek;

import javax.persistence.Embeddable;

@Embeddable
public class Verkeerstechniek_LinksAfslaan {

    private int opstellingLinks;
    private int uitvoeringLinks;
    private int linksAfslaanAndere;

    public Verkeerstechniek_LinksAfslaan() {

    }

    public int getOpstellingLinks() {
        return opstellingLinks;
    }

    public void setOpstellingLinks(int opstellingLinks) {
        this.opstellingLinks = opstellingLinks;
    }

    public int getUitvoeringLinks() {
        return uitvoeringLinks;
    }

    public void setUitvoeringLinks(int uitvoeringLinks) {
        this.uitvoeringLinks = uitvoeringLinks;
    }

    public int getLinksAfslaanAndere() {
        return linksAfslaanAndere;
    }

    public void setLinksAfslaanAndere(int linksAfslaanAndere) {
        this.linksAfslaanAndere = linksAfslaanAndere;
    }
}
