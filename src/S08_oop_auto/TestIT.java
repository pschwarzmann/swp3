package S08_oop_auto;

import java.util.Scanner;

public class TestIT {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Auto auto = new Auto(200, "Porsche", "AC1234", "huuup", 0);
        Engine engine = new Engine(0);
        Tank tank = new Tank(300, 0);
        Rückspiegel rückspiegel1 = new Rückspiegel(20, 5);
        Rückspiegel rückspiegel2 = new Rückspiegel(20, 15);
        Reifen reifen1 = new Reifen(23, "Michelin", 32);
        Reifen reifen2 = new Reifen(23, "Michelin", 32);
        Reifen reifen3 = new Reifen(23, "Michelin", 32);
        Reifen reifen4 = new Reifen(23, "Michelin", 32);

        auto.addReifen(reifen1);
        auto.addReifen(reifen2);
        auto.addReifen(reifen3);
        auto.addReifen(reifen4);
        auto.addRückspiegel(rückspiegel1);
        auto.addRückspiegel(rückspiegel2);


        Scanner scanner = new Scanner(System.in);
        double dtest;
        int inEingabe;


        //autodaten:
        do {
            System.out.println("--------------------------Menue + Autodaten----------------------------");
            System.out.println("Das Auto hat " + auto.getiLeistung() + " PS.");
            System.out.println("Die Auto Marke lautet " + auto.getsBrand() + ".");
            System.out.println("Die Auto Seriennummer lautet " + auto.getsSerialnumber() + ".");
            System.out.println("Die Auto Tankkappazität liegt bei " + tank.getiFualkap() + " Liter.");
            System.out.println("Informationen zu beiden Rückspiegel:\nRückspiegel1: Position:" + auto.getRückspiegel().get(0).getPostion() + " Größe:" + auto.getRückspiegel().get(0).getGröße() + "\nRückspiegel2: Position:" + auto.getRückspiegel().get(1).getPostion() + " Größe:" + auto.getRückspiegel().get(1).getGröße());
            System.out.println("Informationen zu den Reifen(Sie wird nur einmal ausgegeben da alle 4 gleich sind):\nZoll:" +auto.getReifens().get(0).getZoll() + " Hersteller:"  + auto.getReifens().get(0).getReifenHersteller() + " Reifenbreite:" + auto.getReifens().get(0).getReifenbreite());
            System.out.println("-----------------------------------------------------------------------");

            System.out.println("Wie viel Tank möchten Sie ins Auto füllen (bis 300 Liter möglich)?");
            System.out.print("->");
            dtest = scanner.nextDouble();
            if (dtest > 300) {
                double dTankpreis = 1.5 * dtest;
                tank.setiFuel((int) dtest);
                System.out.println("Sie zahlen " + dTankpreis + " €!");
                System.out.println("Sie haben zu viel getankt (der Stand bleibt bei 300 Litern)!");
                dtest = 300;
            }
            System.out.println("-----------------------------------------------------------------------");

            System.out.println("Wenn Sie die Daten gelesen haben und den Tank befüllt haben, drücken Sie\ndie 0, um loszufahren!:");
            System.out.print("->");
            inEingabe = scanner.nextInt();
        } while (inEingabe != 0);


        //verwaltungs menü
        do {

            System.out.println("---------------------------------Menue---------------------------------");
            System.out.println("Was möchten Sie machen? (Sie haben " + dtest + " Liter Tank)");
            System.out.println("0 - Abbruch\n1 - Turboboost\n2 - Hupen\n3 - mögliche Reichweite\n4 - Bremse\n5 - Gangeinlegen\n6 - Überprüfung von Reifen und Rückspiegel");
            System.out.print("->");
            inEingabe = scanner.nextInt();

            if (inEingabe == 1) {
                turboBoost(tank);
            } else if (inEingabe == 2) {
                honkMenu(auto);
            } else if (inEingabe == 3) {
                remainingRange(tank, auto);
            } else if (inEingabe == 4) {
                breakMethod(auto);
            } else if (inEingabe == 5) {
                gangschaltung(engine);
            }

        } while (0 != inEingabe);
    }



    //funktionen:
    private static void turboBoost(Tank tank) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Turboboosting...");
        if (tank.getiFuel() > tank.getiFualkap() * 0.10) {
            System.out.println("SuperBoostMode!");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    private static void honkMenu(Auto auto) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Wie viel willst du hupen? ");
        int iWiederholungen = scanner.nextInt();

        System.out.print(iWiederholungen + " mal : ");
        for (int i = 0; i < iWiederholungen; i++) {
            System.out.print(auto.getsHonk() + ", ");
        }
        System.out.println();

    }

    private static void remainingRange(Tank tank, Auto auto) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Berechnung der möglichen Reichweite...");
        auto.setiRemainingRange((int) (tank.getiFuel() * 9.17));
        System.out.println("Das Auto könnte mit diesem Tank noch " + auto.getiRemainingRange() + " km\nweit fahren.");

    }

    private static void breakMethod(Auto auto) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ich bremse");
    }

    private static void gangschaltung(Engine engine) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Es gibt die Gänge 1-6 (1 langsam/6 schnell), wie schnell möchten\nSie fahren?:");
        engine.setiEngine(scanner.nextInt());
        if (engine.getiEngine() == 1) {
            System.out.println("Sie fahren 30 km/h");
        } else if (engine.getiEngine() == 2) {
            System.out.println("Sie fahren 60 km/h");
        } else if (engine.getiEngine() == 3) {
            System.out.println("Sie fahren 90 km/h");
        } else if (engine.getiEngine() == 4) {
            System.out.println("Sie fahren 130 km/h");
        } else if (engine.getiEngine() == 5) {
            System.out.println("Sie fahren 190 km/h");
        } else if (engine.getiEngine() == 6) {
            System.out.println("Sie fahren 250 km/h");
        }
    }

}