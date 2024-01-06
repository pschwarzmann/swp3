package S09_oop_fernbedinung;

public class Batterie {
    private int Akku;

    //constructor

    public Batterie(int akku) {
        Akku = akku;
    }


    //getter setter

    public int getAkku() {
        return Akku;
    }

    public void setAkku(int akku) {
        Akku = akku;
    }
}
