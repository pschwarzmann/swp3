package S07_oop;

public class Fahrrad {
    private int iLeistung = 0;
    private String sFarbe = "Keine Farbe";

    private String sMarke = "Cube";

    public Fahrrad(int iLeistung, String sFarbe, String sMarke) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.sMarke = sMarke;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public String getsMarke() {
        return sMarke;
    }

    public void setsMarke(String sMarke) {
        this.sMarke = sMarke;
    }
}

