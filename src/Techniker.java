import java.util.ArrayList;

public class Techniker extends Personal{
    ArrayList<Dienstaufzeichnung> dienste = new ArrayList<>();

    public Techniker(){

    }
    public Techniker(int id){
        this.id=id;
    }
    public Techniker(int id, String name, String nachname, Filiale filiale ){
        this.id=id;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
    }
    public Techniker(int id, String name, String nachname, Filiale filiale , String gaburtsdatum, String geschlecht, String adress, int tel_nr){
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
}
