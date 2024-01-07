package S15_oop_handy;

import java.util.List;

public class Handy {
    private String farbe;
    private Kamera kamera;
    private Speicherkarte sdkarte;
    private SIM sim;

    // Konstruktor
    public Handy(String farbe, Kamera kamera, Speicherkarte sdkarte, SIM sim) {
        this.farbe = farbe;
        this.kamera = kamera;
        this.sdkarte = sdkarte;
        this.sim = sim;
    }

    public void Foto(int erweiterung, String name) {
        kamera.Bild(erweiterung, name);
    }

    public void AlleDateien() {
        List<Fotodatei> filesList = sdkarte.getAlledateien();
        for (Fotodatei file : filesList) {
            System.out.println(file.getInfo());
        }
    }

    public void Anrufen(String number) {
        sim.Anrufen(number);
    }

    public int Speicherplatz() {
        System.out.println("Sie haben " + sdkarte.getSpeicherplatz() + " MB frei");
        return sdkarte.getSpeicherplatz();
    }


    // Getter und Setter


    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void setKamera(Kamera kamera) {
        this.kamera = kamera;
    }

    public Speicherkarte getSdkarte() {
        return sdkarte;
    }

    public void setSdkarte(Speicherkarte sdkarte) {
        this.sdkarte = sdkarte;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }
}
