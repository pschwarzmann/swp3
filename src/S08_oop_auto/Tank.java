package S08_oop_auto;

public class Tank {

    private double iFuel;
    private int iFualkap;

    public Tank(double iFuel, int iFualkap) {
        this.iFuel = iFuel;
        this.iFualkap = iFualkap;
    }

    public Tank() {

    }

    public double getiFuel() {
        return iFuel;
    }

    public void setiFuel(double iFuel) {
        this.iFuel = iFuel;
    }

    public int getiFualkap() {
        return iFualkap;
    }

    public void setiFualkap(int iFualkap) {
        this.iFualkap = iFualkap;
    }
}