package S06_TikTakToe;

import java.util.Scanner;

public class S06_TikTakToe1 {

    public static void main(String[] args) {

        int Zug = 0;
        int Spieler1 = 0;
        int Spieler2 = 0;
        String SEingabe = "";
        int iEingabe = 0;
        Scanner scanner = new Scanner(System.in);

        String[][] spielfeld = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        do {
            System.out.println("---------------------------------------Menue---------------------------------------");
            System.out.println("-> Wenn Sie das Spiel starten wollen, drücken Sie die 1, um zu Beenden die 2!");
            iEingabe = scanner.nextInt();

            if (iEingabe == 1) {
                System.out.println("---------------------------------------Menue---------------------------------------");
                System.out.println("-> Player 1, mit welchem Feld möchten Sie beginnen x(0-2), y(0-2)?");
                zeigeSpielfeld(spielfeld);
                String input = scanner.next();
                String[] in = input.split(",");

            }

        } while (iEingabe != 2);
    }

    private static void zeigeSpielfeld(String[][] spielfeld) {
        System.out.println("    0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + spielfeld[i][j] + "  ");
            }
            System.out.println("|");
        }
    }
}