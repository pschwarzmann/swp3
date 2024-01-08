package S16_oop_Kamera;

public class TestIt {

    public static void main(String[] args) {
        Hersteller hersteller = new Hersteller("Canon","Norwegen");
        Datei datei = new Datei("file-3450", "06/01/2024", 9);
        Linse linse = new Linse(9000);
        Speicherkarte sdKarte = new Speicherkarte(17, linse);
        sdKarte.addDatei(datei);
        Kamera kamera = new Kamera(9,250,"schwarz",sdKarte,linse,hersteller);


        kamera.fotomachen("picture-23590426047123", "29/12/2023");
        kamera.fotomachen("picture-54736565264547", "29/12/2023");
        kamera.SDkartewechseln();
        kamera.fotomachen("picture-24357687903452", "30/3/2023");
        kamera.fotomachen("picture-4789021ß0ß0876", "31/3/2023");
        kamera.fotomachen("picture-67490ß83691353", "31/3/2023");
    }
}