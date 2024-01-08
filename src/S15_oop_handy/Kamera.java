package S15_oop_handy;

class Kamera {
    private int auflösung;
    private Speicherkarte sdkarte;



    //constructor
    public Kamera(int auflösung, Speicherkarte sdkarte) {
        this.auflösung = auflösung;
        this.sdkarte = sdkarte;
    }


    public void Bild(int erweiterung, String name) {
        Fotodatei fotodatei = new Fotodatei(erweiterung, this.auflösung, name);
        sdkarte.addDatei(fotodatei);
        sdkarte.Dateispeichern();
    }



    //getter setter
    public int getAuflösung() {
        return auflösung;
    }

    public void setAuflösung(int auflösung) {
        this.auflösung = auflösung;
    }

    public Speicherkarte getSpeicherkarte() {
        return sdkarte;
    }

    public void setSpeicherkarte(Speicherkarte sdkarte) {
        this.sdkarte = sdkarte;
    }
}