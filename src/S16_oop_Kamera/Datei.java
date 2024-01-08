package S16_oop_Kamera;

public class Datei {
    private String name;
    private String datum;
    private int größe;



    //cosntructor
    public Datei(String name, String datum, int größe) {
        this.name = name;
        this.datum = datum;
        this.größe = größe;
    }



    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getGröße() {
        return größe;
    }

    public void setGröße(int größe) {
        this.größe = größe;
    }
}
