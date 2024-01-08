package S16_oop_Kamera;

public class Hersteller {
    private String name;
    private String land;



    //constructor
    public Hersteller(String name, String land) {
        this.name = name;
        this.land = land;
    }




    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
