public class Person {
    int id;
    String name;
    String nachname;
    Filiale filiale;
    String geburtsdatum;
    String geschlecht;
    String adress;
    int tel_nr;


    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public Filiale getFiliale() {
        return filiale;
    }
    public void setFiliale(Filiale filiale) {
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

    public int getTel_nr() {
        return tel_nr;
    }
    public void setTel_nr(int tel_nr) {
        this.tel_nr = tel_nr;
    }

}
