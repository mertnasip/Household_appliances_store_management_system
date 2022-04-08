import java.util.ArrayList;

public class Filiale {
    int filialeId;
    String filialeName;
    String adress;
    ArrayList<Personal> personal = new ArrayList<>();
    ArrayList<Produkt> produkten = new ArrayList<>();
    ArrayList<Kunde> kunden = new ArrayList<>();
    ArrayList<Verkaufaufzeichnung> verkaeufe = new ArrayList<>();

    //getters and setters
    public int getFilialeId() {
        return filialeId;
    }
    public void setFilialeId(int filialeId) {
        this.filialeId = filialeId;
    }

    public String getFilialeName() {
        return filialeName;
    }
    public void setFilialeName(String filialeName) {
        this.filialeName = filialeName;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Personal> getPersonal() {
        return personal;
    }
    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }

    public ArrayList<Produkt> getProdukten() {
        return produkten;
    }
    public void setProdukten(ArrayList<Produkt> produkten) {
        this.produkten = produkten;
    }

    public ArrayList<Kunde> getKunden() {
        return kunden;
    }
    public void setKunden(ArrayList<Kunde> kunden) {
        this.kunden = kunden;
    }

    public ArrayList<Verkaufaufzeichnung> getVerkaeufe() {
        return verkaeufe;
    }
    public void setVerkaeufe(ArrayList<Verkaufaufzeichnung> verkaeufe) {
        this.verkaeufe = verkaeufe;
    }
}
