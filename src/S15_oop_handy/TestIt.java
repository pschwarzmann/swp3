package S15_oop_handy;


public class TestIt {
    public static void main(String[] args) {
        Speicherkarte sdCard1 = new Speicherkarte(200);
        SIM sim1 = new SIM(3, "+436509905076");
        Fotodatei foto1 = new Fotodatei(1, 10, "Foto1");
        Fotodatei foto2 = new Fotodatei(2, 15, "Foto2");
        Kamera kamera1 = new Kamera(10, sdCard1);
        sdCard1.addDatei(foto1);
        sdCard1.addDatei(foto2);
        Handy handy = new Handy("cyan", kamera1, sdCard1, sim1);

        handy.Foto(31, "photo-55982613126439");
        handy.AlleDateien();
        handy.Anrufen("+434236239");
        handy.Speicherplatz();
    }
}