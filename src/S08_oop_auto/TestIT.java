package S08_oop_auto;

import java.util.Scanner;

public class TestIT {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Autodaten auto = new Autodaten(200, "Porsche", "AC1234", "huuup", 0);
        Engine engine = new Engine(0);
        Tank tank = new Tank(300, 0);
        Reifen reifen = new Reifen("Reifen links vorne funktioniert", "Reifen rechts vorne funktioniert", "Reifen links hinten funktioniert", "Reifen rechts hinten funktioniert", "Michelin", 32, "Radial");
        Rückspiegel rückspiegel = new Rückspiegel("Rückspiegel links funktioniert", "Rückspiegel rechts funktioniert", "Porsche");

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
            }else if (inEingabe == 6) {
                infoReifenRücksp(rückspiegel, reifen);
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

    private static void honkMenu(Autodaten auto) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Wie viel willst du hupen? ");
        int iWiederholungen = scanner.nextInt();

        System.out.print(iWiederholungen + " mal : ");
        for (int i = 0; i < iWiederholungen; i++) {
            System.out.print(auto.getsHonk() + ", ");
        }
        System.out.println();

    }

    private static void remainingRange(Tank tank, Autodaten auto) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Berechnung der möglichen Reichweite...");
        auto.setiRemainingRange((int) (tank.getiFuel() * 9.17));
        System.out.println("Das Auto könnte mit diesem Tank noch " + auto.getiRemainingRange() + " km\nweit fahren.");

    }

    private static void breakMethod(Autodaten auto) {
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

    private static void infoReifenRücksp(Rückspiegel rückspiegel, Reifen reifen){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Hier die Infos zu den Reifen und zu den Rückspiegeln:\n");
        System.out.println("Reifen:\n" + reifen.getReifen1() + "\n" + reifen.getReifen2() + "\n" + reifen.getReifen3() + "\n" + reifen.getReifen4() + "\nReifenhersteller: " + reifen.getReifenHersteller() + "\nReifenbreite: " + reifen.getReifenbreite() + "cm\nReifenart: " + reifen.getReifenart() + "\n");
        System.out.println("Rückspiegel:\n" + rückspiegel.getRückspiegel1() + "\n" + rückspiegel.getRückspiegel2() + "\nRückspiegerlhersteller: " + rückspiegel.getHerstellerRückspiegel() + "\n");
    }
}