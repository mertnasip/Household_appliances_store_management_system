import java.util.ArrayList;

public class Verkaeufer extends Personal{
    ArrayList<Verkaufaufzeichnung> verkaeufe = new ArrayList<>();

    public Verkaeufer(){

    }
    public Verkaeufer(int id){
        this.id=id;
    }
    public Verkaeufer(int id, String name, String nachname, Filiale filiale ){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
    }
    public Verkaeufer(int id, String name, String nachname, Filiale filiale , String gaburtsdatum, String geschlecht, String adress, int tel_nr){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
        this.geburtsdatum=gaburtsdatum;
        this.geschlecht=geschlecht;
        this.adress=adress;
        this.tel_nr=tel_nr;
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
