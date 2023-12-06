package S08_oop_auto;

import java.util.Scanner;

public class TestIT {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Auto auto = new Auto();
        Engine engine = new Engine();
        Tank tank = new Tank();
        auto.setiLeistung(200);
        auto.setsBrand("Porsche");
        auto.setsSerialnumber("AC1234");
        auto.setsHonk("huuup");
        auto.setiRemainingRange(0);

        tank.setiFualkap(300);
        tank.setiFuel(0);

        engine.setiEngine(0);

        Scanner scanner = new Scanner(System.in);
        double dtest = 0;
        int inEingabe;
        int iWiederholungen = 0;

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
                System.out.println("Sie haben zu viel getankt (der Stand bleibt bei 300 Litern)!");
                dtest = 300;
            }

            double dTankpreis = 1.5 * dtest;
            tank.setiFuel((int) dtest);
            System.out.println("Sie zahlen " + dTankpreis + " €!");
            System.out.println("-----------------------------------------------------------------------");

            System.out.println("Wenn Sie die Daten gelesen haben und den Tank befüllt haben, drücken Sie\ndie 0, um loszufahren!:");
            System.out.print("->");
            inEingabe = scanner.nextInt();
        } while (inEingabe != 0);

        do {

            System.out.println("---------------------------------Menue---------------------------------");
            System.out.println("Was möchten Sie machen? (Sie haben " + dtest + " Liter Tank)");
            System.out.println("0 - Abbruch\n1 - Turboboost\n2 - Hupen\n3 - mögliche Reichweite\n4 - Bremse\n5 - Gangeinlegen");
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

    private static void turboBoost(Tank tank) {
        System.out.println("Turboboosting...");
        if (tank.getiFuel() > tank.getiFualkap() * 0.10) {
            System.out.println("SuperBoostMode!");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    private static void honkMenu(Auto auto) {
        System.out.print("Wie viel willst du hupen? ");
        int iWiederholungen = scanner.nextInt();

        System.out.print(iWiederholungen + " mal : ");
        for (int i = 0; i < iWiederholungen; i++) {
            System.out.print(auto.getsHonk() + ", ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
    }

    private static void remainingRange(Tank tank, Auto auto) {
        System.out.println("Berechnung der möglichen Reichweite...");
        auto.setiRemainingRange((int) (tank.getiFuel() * 9.17));
        System.out.println("Das Auto könnte mit diesem Tank noch " + auto.getiRemainingRange() + " km\nweit fahren.");
        System.out.println("-----------------------------------------------------------------------");
    }

    private static void breakMethod(Auto auto) {
        System.out.println("Ich bremse");
        System.out.println("-----------------------------------------------------------------------");
    }

    private static void gangschaltung(Engine engine) {
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