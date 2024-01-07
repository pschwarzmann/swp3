package S10_oop_at.xxx.examples.cars;

import java.util.ArrayList;
class Hersteller {
    private String marke;
    private double rabatt;
    private String herkunftsland;
    private ArrayList<Auto> autos;

    // constructor
    public Hersteller(String marke, double rabatt, String herkunftsland) {
        this.marke = marke;
        this.rabatt = rabatt;
        this.herkunftsland = herkunftsland;
        this.autos = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        this.autos.add(auto);
    }

    // getter and setter

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public double getRabatt() {
        return rabatt;
    }

    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }

    public String getHerkunftsland() {
        return herkunftsland;
    }

    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
}