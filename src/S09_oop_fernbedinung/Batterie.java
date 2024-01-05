package S09_oop_fernbedinung;

public class Batterie {

    private int Batterie1;

    private int Batterie2;

    //constructor

    public Batterie(int batterie1, int batterie2) {
        Batterie1 = batterie1;
        Batterie2 = batterie2;
    }

    //getter setter

    public int getBatterie1() {
        return Batterie1;
    }

    public void setBatterie1(int batterie1) {
        Batterie1 = batterie1;
    }

    public int getBatterie2() {
        return Batterie2;
    }

    public void setBatterie2(int batterie2) {
        Batterie2 = batterie2;
    }
}
