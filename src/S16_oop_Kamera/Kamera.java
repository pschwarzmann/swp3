package S16_oop_Kamera;

public class Kamera {
    private int pixel;
    private int gewicht;
    private String farbe;
    private Speicherkarte sdKarte;
    private Linse linsen;
    private Hersteller hersteller;



    //constructor
    public Kamera(int pixel, int gewicht, String farbe, Speicherkarte sdKarte, Linse linsen, Hersteller hersteller) {
        this.pixel = pixel;
        this.gewicht = gewicht;
        this.farbe = farbe;
        this.sdKarte = sdKarte;
        this.linsen = linsen;
        this.hersteller = hersteller;
    }




    public void fotomachen(String name, String datum){
        if(sdKarte.sichern() == true){
            Datei bild = new Datei(name,datum, linsen.dateigröße());
            sdKarte.addDatei(bild);
        }
    }

    public void SDkartewechseln(){
        Speicherkarte neueSDkarte = new Speicherkarte(32,linsen);
        sdKarte = neueSDkarte;
        sdKarte.berechnungSpeicherplatz();
        System.out.println("SDKarte wurde ausgewechselt.");
    }




    //getter setter

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Speicherkarte getSdKarte() {
        return sdKarte;
    }

    public void setSdKarte(Speicherkarte sdKarte) {
        this.sdKarte = sdKarte;
    }

    public Linse getLinsen() {
        return linsen;
    }

    public void setLinsen(Linse linsen) {
        this.linsen = linsen;
    }

    public Hersteller getHersteller() {
        return hersteller;
    }

    public void setHersteller(Hersteller hersteller) {
        this.hersteller = hersteller;
    }
}