package S16_oop_Kamera;

import java.util.ArrayList;
import java.util.List;

public class Speicherkarte {
    private int kapazität;
    private List<Datei> dateien;
    private Linse linsen;



    //constructor
    public Speicherkarte(int kapazität,Linse linsen) {
        this.kapazität = kapazität;
        this.linsen = linsen;
        this.dateien = new ArrayList<>();
    }




    public int berechnungSpeicherplatz(){
        for(Datei datei : this.dateien){
            int a = 0;
            a += datei.getGröße();
        }
        int freierSpeicher = this.kapazität;
        return freierSpeicher;
    }

    public boolean sichern(){
        boolean sichern;
        if(berechnungSpeicherplatz()<linsen.dateigröße()){
            System.out.println("Sie haben zu wenig Speicherplatz.");
            sichern = false;
        } else if (berechnungSpeicherplatz()>10) {
            System.out.println("Das Bild wird gespeichert.");
            sichern = true;
        }else {
            System.out.println("Wechseln sie die Speicherkarte, da sie ausgeht.");
            sichern = true;
        }
        return sichern;
    }

    public void addDatei(Datei dateien){
        this.dateien.add(dateien);
    }





    //getter setter

    public int getKapazität() {
        return kapazität;
    }

    public void setKapazität(int kapazität) {
        this.kapazität = kapazität;
    }

    public List<Datei> getDateien() {
        return dateien;
    }

    public void setDateien(List<Datei> dateien) {
        this.dateien = dateien;
    }

    public Linse getLinsen() {
        return linsen;
    }

    public void setLinsen(Linse linsen) {
        this.linsen = linsen;
    }
}
