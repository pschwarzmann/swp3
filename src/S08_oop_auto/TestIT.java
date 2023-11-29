package S08_oop_auto;

import java.util.Scanner;

public class TestIT {

    public static void main(String[] args) {

        // Ausgabe Auto
        Auto auto = new Auto();
        auto.setiLeistung(200);
        auto.setsBrand("Porsche");
        auto.setsSerialnumber("AC1234");
        auto.setiFualkap(300);
        auto.setsHonk("");
        auto.setiRemainingRange(0);
        auto.setsEngine("0");

        // Deklaration
        Scanner scanner = new Scanner(System.in);
        double dtest = 0;
        int inEingabe;

        do {
            // Autodaten
            System.out.println("--------------------------Menue + Autodaten----------------------------");
            System.out.println("Das Auto hat " + auto.getiLeistung() + " PS.");
            System.out.println("Die Auto Marke lautet " + auto.getsBrand() + ".");
            System.out.println("Die Auto Seriennummer lautet " + auto.getsSerialnumber() + ".");
            System.out.println("Die Auto Tankkappazität liegt bei " + auto.getiFualkap() + " Liter.");
            System.out.println("-----------------------------------------------------------------------");

            // Tanken
            System.out.println("Wie viel Tank möchten Sie ins Auto füllen (bis 300 Liter möglich)?");
            System.out.print("->");
            dtest = scanner.nextDouble();
            if (dtest > 300) {
                System.out.println("Sie haben zu viel getankt (der Stand bleibt bei 300 Litern)!");
                dtest = 300;
            }

            double dTankpreis = 1.5 * dtest;
            auto.setiFuel((int) dtest);
            System.out.println("Sie zahlen " + dTankpreis + " €!");
            System.out.println("-----------------------------------------------------------------------");

            // Verweisung zum Menü
            System.out.println("Wenn Sie die Daten gelesen haben und den Tank befüllt haben, drücken Sie die 0, um loszufahren!:");
            System.out.print("->");
            inEingabe = scanner.nextInt();
        } while (inEingabe != 0);

        do {

            // Menü
            System.out.println("---------------------------------Menue---------------------------------");
            System.out.println("Was möchten Sie machen? (Sie haben " + dtest + " Liter Tank)");
            System.out.println("0 - Abbruch\n1 - Turboboost\n2 - Hupen\n3 - mögliche Reichweite\n4 - Bremse\n5 - Gangeinlegen");
            System.out.print("->");
            inEingabe = scanner.nextInt();

            // Methodenaufrufe
            if (inEingabe == 1) {
                turboBoost(auto);
            } else if (inEingabe == 2) {
                honkMenu(auto, scanner);
            } else if (inEingabe == 3) {
                remainingRange(auto);
            } else if (inEingabe == 4) {
                breakMethod(auto);
            }

        } while (0 != inEingabe);
    }


//Methoden:

    //Turboboost
    private static void turboBoost(Auto auto) {
        System.out.println("Turboboosting...");
        if (auto.getiFuel() > auto.getiFualkap() * 0.10) {
            System.out.println("SuperBoostMode!");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    //Hupen
    private static void honkMenu(Auto auto, Scanner scanner) {
        System.out.println("Wie oft möchten Sie hupen?");
        int iAmountofRepetitions = scanner.nextInt();
        auto.getsHonk(iAmountofRepetitions);
        System.out.println("-----------------------------------------------------------------------");
    }

    //mögliche Reichweite
    private static void remainingRange(Auto auto) {
        System.out.println("Berechnung der möglichen Reichweite...");
        auto.setiRemainingRange((int) (auto.getiFuel() * 9.17));
        System.out.println("Das Auto könnte mit diesem Tank noch " + auto.getiRemainingRange() + " km weit fahren.");
        System.out.println("-----------------------------------------------------------------------");
    }

    //Bremse
    private static void breakMethod(Auto auto) {
        System.out.println("Ich bremse");
        System.out.println("-----------------------------------------------------------------------");
    }

    //Gangschaltung beim Motor
    private static void gangschaltung(Auto auto){
        System.out.println("Es gibt die Gänge 1-100 (1 ist langsam), wie schnell möchten Sie fahren?:");
        auto.setsEngine(scanner.nextInt());
    }

}
