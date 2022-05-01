package Entities;

public class Person {
	String id;
    String name;
    String nachname;
    String filiale;
    String geburtsdatum;
    String geschlecht;
    String adress;
    String tel_nr;


    //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getFiliale() {
        return filiale;
    }
    public void setFiliale(String filiale) {
        this.filiale = filiale;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }
    public void setGeburtsdatum(String gaburtsdatum) {
        this.geburtsdatum = gaburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel_nr() {
        return tel_nr;
    }
    public void setTel_nr(String tel_nr) {
        this.tel_nr = tel_nr;
    }
}
