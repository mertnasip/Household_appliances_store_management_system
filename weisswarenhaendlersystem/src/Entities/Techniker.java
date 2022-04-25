package Entities;

import java.util.ArrayList;

public class Techniker extends Personal {
    ArrayList<Dienstaufzeichnung> dienste = new ArrayList<>();

    public Techniker() {

    }

    public Techniker(String id) {
        this.id = id;
    }

    public Techniker(String id, String name, String nachname, Filiale filiale) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
    }

    public Techniker(String id, String name, String nachname, Filiale filiale, String gaburtsdatum, String geschlecht, String adress, String tel_nr) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
        this.geburtsdatum = gaburtsdatum;
        this.geschlecht = geschlecht;
        this.adress = adress;
        this.tel_nr = tel_nr;
    }

    //funktions of "dienst"
    public ArrayList<Dienstaufzeichnung> getDienste() {
        return dienste;
    }

    /*public Entities.Dienstaufzeichnung getDienst(int dienstId){
        //dienstId ile ilgili servis kaydı bulunacak ve geri döndürülecek
    }*/
    public void dienstAdd(Dienstaufzeichnung dienst) {
        dienste.add(dienst);
    }

    public void dienstLoschen(int dienstId) {
        //dienstId ile ilgili servis kaydı bulunacak ve silinecek
    }
}
