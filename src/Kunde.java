import java.util.ArrayList;

public class Kunde extends Person{
    ArrayList<Dienstaufzeichnung> dienste = new ArrayList<>();
    ArrayList<Verkaufaufzeichnung> verkaeufe = new ArrayList<>();

    public Kunde(){

    }
    public Kunde(int id){
        this.id=id;
    }
    public Kunde(int id, String name, String nachname, Filiale filiale ){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
    }
    public Kunde(int id, String name, String nachname, Filiale filiale , String gaburtsdatum, String geschlecht, String adress, int tel_nr){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
        this.geburtsdatum=gaburtsdatum;
        this.geschlecht=geschlecht;
        this.adress=adress;
        this.tel_nr=tel_nr;
    }

    //funktions of "dienst"
    public ArrayList<Dienstaufzeichnung> getDienste() {
        return dienste;
    }
    /*public Dienstaufzeichnung getDienst(int dienstId){
        //dienstId ile ilgili servis kaydı bulunacak ve geri döndürülecek
    }*/
    public void dienstAdd(Dienstaufzeichnung dienst){
        dienste.add(dienst);
    }
    public void dienstLoschen(int dienstId){
        //dienstId ile ilgili servis kaydı bulunacak ve silinecek
    }

    //funktions of "verkauf"
    public ArrayList<Verkaufaufzeichnung> getVerkaeufe() {
        return verkaeufe;
    }
    /*public Verkaufaufzeichnung getVerkauf(int verkaufId){
        //verkaufId ile ilgili satış kaydı bulunacak ve geri döndürülecek
    }*/
    public void verkaufAdd(Verkaufaufzeichnung verkauf){
        verkaeufe.add(verkauf);
    }
    public void verkaufLoschen(int verkaufId){
        //verkaufId ile ilgili satış kaydı bulunacak ve silinecek
    }

}