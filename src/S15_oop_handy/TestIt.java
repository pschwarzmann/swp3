package S15_oop_handy;


public class TestIt {

    public static void main(String[] args) {
        Speicherkarte sdkarte1 = new Speicherkarte(200);
        SIM sim1 = new SIM(3, "+4366433234");
        Fotodatei foto1 = new Fotodatei(1, 15, "Foto1");
        Fotodatei foto2 = new Fotodatei(2, 20, "Foto2");
        Kamera kamera1 = new Kamera(10, sdkarte1);
        sdkarte1.addDatei(foto1);
        sdkarte1.addDatei(foto2);
        Handy handy = new Handy("grün", kamera1, sdkarte1, sim1);

        handy.Foto(39, "foto-34346475");
        handy.AlleDateien();
        handy.Anrufen("+436647867878");
        handy.Speicherplatz();
    }
}