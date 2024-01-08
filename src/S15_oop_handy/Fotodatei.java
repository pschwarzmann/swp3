package S15_oop_handy;

class Fotodatei {
    private int erweiterung;
    private int größe;
    private String name;


    //constructor
    public Fotodatei(int erweiterung, int größe, String name) {
        this.erweiterung = erweiterung;
        this.größe = größe;
        this.name = name;
    }

    public String getInfo() {
        return "Name: " + this.name + ", Größe: " + this.größe;
    }



    //getter setter
    public int getErweiterung() {
        return erweiterung;
    }

    public void setErweiterung(int erweiterung) {
        this.erweiterung = erweiterung;
    }

    public int getGröße() {
        return größe;
    }

    public void setGröße(int größe) {
        this.größe = größe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}