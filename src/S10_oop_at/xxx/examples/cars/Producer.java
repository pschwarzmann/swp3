package S10_oop_at.xxx.examples.cars;

class Hersteller {
    private String name;
    private String herkunftsland;
    private double rabatt;

    public Hersteller(String name, String herkunftsland, double rabatt) {
        this.name = name;
        this.herkunftsland = herkunftsland;
        this.rabatt = rabatt;
    }

    public double getRabatt() {
        return rabatt;
    }

    public String getName() {
        return name;
    }

    public String getHerkunftsland() {
        return herkunftsland;
    }
}

