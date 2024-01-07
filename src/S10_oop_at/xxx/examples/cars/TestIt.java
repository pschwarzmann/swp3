package S10_oop_at.xxx.examples.cars;

import java.util.ArrayList;

public class TestIt {

    public static void main(String[] args) {

        Motor motor = new Motor(500, "Diesel");
        Auto auto = new Auto("silber", 315, 160000, 7, motor, 1);
        Hersteller hersteller = new Hersteller("Porsche GT4", 4, "Deutschland");

        System.out.println("Hier alle Daten zum Motor des Autos:\nLeistung: " + motor.getLeistung() + "PS\nMotortyp: " + motor.getType());
        System.out.println("\nHier alle Infos zum Auto:\nFarbe: "+ auto.getFarbe() + "\nMax Geschwindigkeit: "+ auto.getMasgeschwindigkeit() + "Km/h\nBasispreis: "+ auto.getBasispreis() + "€\nBasisverbrauch: "+ auto.getBasisverbrauch() + "L/Km\nGefahrene km: "+ auto.getGefahrenekm());
        System.out.println("\nHier alle Infos zum Hersteller des Autos:\nMarke + Modell: " + hersteller.getMarke() + "\nRabbat in %: " + hersteller.getRabatt() + "\nHerkunftsland: " + hersteller.getHerkunftsland());

        hersteller.addAuto(auto);
        auto.setHersteller(hersteller);

        auto.preisberech();
        auto.fahren();
    }
}