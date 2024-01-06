package S09_oop_fernbedinung;

import S08_oop_auto.Reifen;

import java.util.ArrayList;
import java.util.List;

public class Fernbedinung {

    private boolean turnOn;

    private boolean turnOff;

    private List<Batterie> batterien;


    //constructor
    public Fernbedinung(boolean turnOn, boolean turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.batterien = new ArrayList<>();
    }

    public void addBatterie(Batterie batterie){
        this.batterien.add(batterie);
    }


    //getter setter
    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean isTurnOff() {
        return turnOff;
    }

    public void setTurnOff(boolean turnOff) {
        this.turnOff = turnOff;
    }

    public List<Batterie> getBatterien() {
        return batterien;
    }

    public void setBatterien(List<Batterie> batterien) {
        this.batterien = batterien;
    }
}



