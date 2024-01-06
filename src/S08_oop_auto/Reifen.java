package S08_oop_auto;

public class Reifen {

    private int Zoll;
    private String ReifenHersteller;
    private int Reifenbreite;


    //Construcator
    public Reifen(int zoll, String reifenHersteller, int reifenbreite) {
        Zoll = zoll;
        ReifenHersteller = reifenHersteller;
        Reifenbreite = reifenbreite;
    }


    //getter setter
    public int getZoll() {
        return Zoll;
    }

    public void setZoll(int zoll) {
        Zoll = zoll;
    }

    public String getReifenHersteller() {
        return ReifenHersteller;
    }

    public void setReifenHersteller(String reifenHersteller) {
        ReifenHersteller = reifenHersteller;
    }

    public int getReifenbreite() {
        return Reifenbreite;
    }

    public void setReifenbreite(int reifenbreite) {
        Reifenbreite = reifenbreite;
    }
}
