package S11_oop_Lampe;

public class TestIt {

    public static void main(String[] args) {

        Element elemente1 = new Element("lampe 1","blau",200,false);
        Element elemente2 = new Element("lampe 2","blau",200,true);
        Lampe lamp = new Lampe();

        lamp.addElement(elemente1);
        lamp.addElement(elemente2);


        lamp.turnOn();
        lamp.turnAllOn();
        System.out.println(lamp.OverallPowerUsage());
        lamp.printNamesOfLightElements();
    }
}