package S10_oop_at.xxx.examples.cars;

import java.util.ArrayList;
class Motor {
    private int leistung;
    private String type;

    // constructor

    public Motor(int leistung, String type) {
        this.leistung = leistung;
        this.type = type;
    }

    // getter setter

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}