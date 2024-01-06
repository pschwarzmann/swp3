package S10_oop_at.xxx.examples.cars;

import java.util.ArrayList;
public class TestIt {
    public static void main(String[] args) {
        Hersteller toyota = new Hersteller("Toyota", "Japan", 5.0);
        Hersteller audi = new Hersteller("Audi", "Deutschland", 7.5);

        Motor benzinMotor = new Motor("Benzin", 150);
        Motor dieselMotor = new Motor("Diesel", 120);

        ArrayList<Auto> autos = new ArrayList<>();

        autos.add(new Auto("Blau", 200, 25000.0, 6.5, toyota, benzinMotor));
        autos.add(new Auto("Rot", 220, 30000.0, 7.0, audi, dieselMotor));

        for (Auto auto : autos) {
            auto.zeigeInformationen();
            System.out.println("----------------------");
        }
    }
}