package Entities;

public class Produkt {
    int produktId;
    String produktTitel;
    String produktName;
    Filiale filiale;
    double preis;
    String farbe;
    String garantiezeit;
    String informationen;
    Verkaufaufzeichnung verkauf;

    //getters and setters
    public int getProduktId() {
        return produktId;
    }
    public void setProduktId(int produktId) {
        this.produktId = produktId;
    }

    public String getProduktTitel() {
        return produktTitel;
    }
    public void setProduktTitel(String produktTitel) {
        this.produktTitel = produktTitel;
    }

    public String getProduktName() {
        return produktName;
    }
    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    public Filiale getFiliale() {
        return filiale;
    }
    public void setFiliale(Filiale filiale) {
        this.filiale = filiale;
    }

    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getGarantiezeit() {
        return garantiezeit;
    }
    public void setGarantiezeit(String garantiezeit) {
        this.garantiezeit = garantiezeit;
    }

    public String getInformationen() {
        return informationen;
    }
    public void setInformationen(String informationen) {
        this.informationen = informationen;
    }

    public Verkaufaufzeichnung getVerkauf() {
        return verkauf;
    }
    public void setVerkauf(Verkaufaufzeichnung verkauf) {
        this.verkauf = verkauf;
    }
}
