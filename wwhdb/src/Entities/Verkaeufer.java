package Entities;

import java.util.ArrayList;

public class Verkaeufer extends Personal {
    ArrayList<Verkaufaufzeichnung> verkaeufe = new ArrayList<>();
	

    public Verkaeufer() {

    }

    public Verkaeufer(String id, String personalId, String passwort){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
    }

    public Verkaeufer(String id, String name, String nachname, String filiale) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
    }

    public Verkaeufer(String id, String personalId, String passwort, String name, String nachname, String filiale , String gaburtsdatum, String geschlecht, String adress, String telNr){
    	super(id,personalId,passwort,name,nachname,filiale,gaburtsdatum,geschlecht,adress,telNr);
    }

    //funktions of "verkauf"
    public ArrayList<Verkaufaufzeichnung> getVerkaeufe() {
        return verkaeufe;
    }

    /*public Entities.Verkaufaufzeichnung getVerkauf(int verkaufId){
        //verkaufId ile ilgili satýþ kaydý bulunacak ve geri döndürülecek
    }*/
    public void verkaufAdd(Verkaufaufzeichnung verkauf) {
        verkaeufe.add(verkauf);
    }

    public void verkaufLoschen(int verkaufId) {
        //verkaufId ile ilgili satýþ kaydý bulunacak ve silinecek
    }
}
