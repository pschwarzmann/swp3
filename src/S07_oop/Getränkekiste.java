package S07_oop;

public class Getränkekiste {

    private int iAnzahlFlaschen = 0;

    private String sGetränke = "";

    private String sMarke = "";

    public String getsMarke() {
        return sMarke;
    }

    public Getränkekiste(int iAnzahlFlaschen, String sGetränke, String sMarke) {
        this.iAnzahlFlaschen = iAnzahlFlaschen;
        this.sGetränke = sGetränke;
        this.sMarke = sMarke;
    }

    public void setsMarke(String sMarke) {
        this.sMarke = sMarke;
    }

    public int getiAnzahlFlaschen() {
        return iAnzahlFlaschen;
    }

    public void setiAnzahlFlaschen(int iAnzahlFlaschen) {
        this.iAnzahlFlaschen = iAnzahlFlaschen;
    }

    public String getsGetränke() {
        return sGetränke;
    }

    public void setsGetränke(String sGetränke) {
        this.sGetränke = sGetränke;
    }
}
