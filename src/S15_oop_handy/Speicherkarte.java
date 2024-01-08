package S15_oop_handy;

import java.util.ArrayList;
import java.util.List;

class Speicherkarte {
    private int kapazität;
    private List<Fotodatei> dateien;
    private Kamera getKamera;



    //constructor
    public Speicherkarte(int kapazität) {
        this.kapazität = kapazität;
        this.dateien = new ArrayList<>();
    }


    public void addDatei(Fotodatei fotodatei) {
        this.dateien.add(fotodatei);
    }

    public int getSpeicherplatz() {
        int x = 0;
        int y;
        for (Fotodatei datei : this.dateien) {
            x += datei.getGröße();
        }
        y = this.kapazität - x;
        return y;
    }

    public List<Fotodatei> getAlledateien() {
        return new ArrayList<>(dateien);
    }

    public void Dateispeichern() {
        int speicherplatz = getSpeicherplatz();
        int speicherplatzverbrauch = getKamera.getAuflösung(); 
        if (speicherplatz > speicherplatzverbrauch) {
            addDatei(dateien.get(dateien.size() - 1));
            System.out.println("Es wurde erfolgreich gespeichert");
        } else {
            System.out.println("Sie haben zu wenig Speicherplatz");
        }
    }

    // Getter und Setter

    public int getKapazität() {
        return kapazität;
    }

    public void setKapazität(int kapazität) {
        this.kapazität = kapazität;
    }

    public List<Fotodatei> getDateien() {
        return dateien;
    }

    public void setDateien(List<Fotodatei> dateien) {
        this.dateien = dateien;
    }
}
