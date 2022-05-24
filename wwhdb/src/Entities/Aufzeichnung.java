package Entities;

public class Aufzeichnung {
    String aufzeichnungId;
    String kunde;
    String personal;
    String produkt;
    float preis;
    String datum;
    
	//getters and setters
    public String getAufzeichnungId() {
        return aufzeichnungId;
    }
    public void setAufzeichnungId(String aufzeichnungId) {
        this.aufzeichnungId = aufzeichnungId;
    }

    public String getKunde() {
        return kunde;
    }
    public void setKunde(String kunde) {
        this.kunde = kunde;
    }

    public String getPersonal() {
        return personal;
    }
    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getProdukt() {
        return produkt;
    }
    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public float getPreis() {
        return preis;
    }
    public void setPreis(float preis) {
        this.preis = preis;
    }
    public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
}