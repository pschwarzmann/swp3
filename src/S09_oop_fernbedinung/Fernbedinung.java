package S09_oop_fernbedinung;

public class Fernbedinung {

    private boolean turnOn;

    private boolean turnOff;


    //constructor

    public Fernbedinung(boolean turnOn, boolean turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
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
}



