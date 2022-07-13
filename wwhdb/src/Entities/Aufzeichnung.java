package Entities;

public class Aufzeichnung {
    String id;
    String kunde;
    String personal;
    String produkt;
    double preis;
    String datum;
    String infos;
    String garantiezeit;
    
	public Aufzeichnung() {
		
	}
	
	public Aufzeichnung(String id, String kunde, String personal, String produkt, double preis, String datum, String garantiezeit, String infos) {
		this.id = id;
		this.kunde = kunde;
		this.personal = personal;
		this.produkt = produkt;
		this.preis = preis;
		this.datum = datum;
		this.garantiezeit = garantiezeit;
		this.infos = infos;
	}
	//getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	public String getInfos() {
		return infos;
	}
	public void setInfos(String infos) {
		this.infos = infos;
	}
	public String getGarantiezeit() {
		return garantiezeit;
	}
	public void setGarantiezeit(String garantiezeit) {
		this.garantiezeit = garantiezeit;
	}
}