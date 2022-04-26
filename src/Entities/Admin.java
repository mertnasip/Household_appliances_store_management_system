package Entities;

public class Admin extends Personal {
    public Admin(){

    }
    public Admin(String id, String personalId, String passwort){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
    }
    public Admin(String id, String name, String nachname, Filiale filiale ){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
    }
    public Admin(String id, String name, String nachname, Filiale filiale , String gaburtsdatum, String geschlecht, String adress, String tel_nr){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
        this.geburtsdatum=gaburtsdatum;
        this.geschlecht=geschlecht;
        this.adress=adress;
        this.tel_nr=tel_nr;
    }
}