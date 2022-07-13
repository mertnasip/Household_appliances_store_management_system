package Entities;

public class Produkt {
    String produktId;
    String produktTitel;
    String produktName;
    String filiale;
    double preis;
    String farbe;
    String garantiezeit;
    String informationen;
    Verkaufaufzeichnung verkauf;
    String hatVerkauft;
    
    public Produkt() {
    	
    }
    
    public Produkt(String produktId, String produktTitel, String produktName, Double preis, String garantiezeit, String filiale, String farbe, String hatVerkauft) {
    	this.produktId=produktId;
    	this.produktTitel=produktTitel;
    	this.produktName=produktName;
    	this.filiale=filiale;
    	this.preis=preis;
    	this.farbe=farbe;
    	this.garantiezeit=garantiezeit;
    	this.hatVerkauft=hatVerkauft;
    }

    //getters and setters
    public String getProduktId() {
        return produktId;
    }
    public void setProduktId(String produktId) {
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

    public String getFiliale() {
        return filiale;
    }
    public void setFiliale(String filiale) {
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
