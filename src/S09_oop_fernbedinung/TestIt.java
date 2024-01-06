package S09_oop_fernbedinung;

import java.util.Scanner;

public class TestIt {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Fernbedinung fernbedinung = new Fernbedinung(false, true);
        Batterie batterie1 = new Batterie(100);
        Batterie batterie2 = new Batterie(100);

        fernbedinung.addBatterie(batterie1);
        fernbedinung.addBatterie(batterie2);

        int iEingabe;
        int iMittelwert;

        do {
            System.out.println("----------------------------Menue-Fernbedinung----------------------------");
            System.out.println("0 - Abbruch\n1 - Einschalten\n2 - Ausschalten\n3 - Batteriestatus");
            System.out.print("->");
            iEingabe = scanner.nextInt();
            iMittelwert = (fernbedinung.getBatterien().get(0).getAkku() + fernbedinung.getBatterien().get(1).getAkku()) / 2;

            if (iEingabe == 1 && !fernbedinung.isTurnOn()) {
                System.out.println("Die Fernbedinung wurde eingeschaltet!");
                fernbedinung.setTurnOn(true);
                System.out.println("Verbraucher angeschlossen!");
            } else if (iEingabe == 1 && fernbedinung.isTurnOn()) {
                System.out.println("Die Fernbedienung ist schon an!");
            }

            if (fernbedinung.isTurnOn() && iEingabe == 1) {
                fernbedinung.getBatterien().get(0).setAkku(fernbedinung.getBatterien().get(0).getAkku() - 5);
                fernbedinung.getBatterien().get(1).setAkku(fernbedinung.getBatterien().get(1).getAkku() - 5);
            }


            if (iEingabe == 2 && fernbedinung.isTurnOn()) {
                System.out.println("Die Fernbedinung wurde ausgeschaltet!");
                fernbedinung.setTurnOff(false);
                System.out.println("Kein Verbraucher angeschlossen!");
            } else if (iEingabe == 2) {
                System.out.println("Die Fernbedienung ist schon ausgeschaltet!");
            }

            if (iEingabe == 3) {
                System.out.println("Die Batterie hat noch " + iMittelwert + "%");
            }

        } while (iEingabe != 0);
    }
}