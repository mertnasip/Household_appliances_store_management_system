public class Admin extends Personal{
    public Admin(){

    }
    public Admin(int id){
        this.id=id;
    }
    public Admin(int id, String name, String nachname, Filiale filiale ){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
    }
    public Admin(int id, String name, String nachname, Filiale filiale , String gaburtsdatum, String geschlecht, String adress, int tel_nr){
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
