public class Aufzeichnung {
    int aufzeichnungId;
    Kunde kunde;
    Personal personal;
    Produkt produkt;
    int preis;

    //getters and setters
    public int getAufzeichnungId() {
        return aufzeichnungId;
    }
    public void setAufzeichnungId(int aufzeichnungId) {
        this.aufzeichnungId = aufzeichnungId;
    }

    public Kunde getKunde() {
        return kunde;
    }
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Personal getPersonal() {
        return personal;
    }
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Produkt getProdukt() {
        return produkt;
    }
    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }
}