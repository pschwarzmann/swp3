package S06_TikTakToe;

import java.util.Objects;
import java.util.Scanner;

public class S06_TikTakToe1 {

    public static void main(String[] args) {

        int ZugCounter = 0;
        int Zeile = 0;
        int Spalte = 0;
        int Spieler = 1;
        int iEingabe = 0;
        boolean Gewonnen= false;
        Scanner scanner = new Scanner(System.in);

        String[][] spielfeld = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        do {
            System.out.println("---------------------------------------Menue---------------------------------------");
            System.out.println("- Wenn Sie das Spiel starten wollen, drücken Sie die 1, um zu Beenden die 2!");
            System.out.print(" -> ");
            iEingabe = scanner.nextInt();

            if (iEingabe == 1) {

                System.out.println("---------------------------------------Menue---------------------------------------");
                System.out.println("- Benutzeranleitung: Geben Sie zuerst die Zahl ein die Sie von der Höhe her möchten\nund danach Enter um die Zahl zu bestimmen bei der Sie die Breite von Ihrem Symbol sein soll");

                do {
                    do {
                        System.out.println("---------------------------------------Menue---------------------------------------");
                        System.out.println("- Spieler" +  Spieler + ", mit welchem Feld möchten Sie beginnen?");
                        zeigeSpielfeld(spielfeld);
                        System.out.print(" -> : ");
                        Zeile = scanner.nextInt();
                        System.out.print(" -> : ");
                        Spalte = scanner.nextInt();

                    } while (Zeile < 0 || Zeile > 2 || Spalte < 0 || Spalte > 2 || !Objects.equals(spielfeld[Zeile][Spalte], " "));

                    // Setze das X des aktuellen Spielers
                    String symbol = (Spieler == 1) ? "X" : "O";
                    spielfeld[Zeile][Spalte] = String.valueOf(symbol);

                    ZugCounter++;

                    // Überprüfe auf einen Gewinner
                    Gewonnen = hatGewonnen(spielfeld, String.valueOf(symbol));

                    // Wechsel zum anderen Spieler
                    Spieler = (Spieler == 1) ? 2 : 1;
                } while (!Gewonnen && ZugCounter < 9);

                // Spielfeld am Ende anzeigen
                zeigeSpielfeld(spielfeld);

                // Ergebnis anzeigen
                if (Gewonnen) {
                    System.out.println("Spieler " + Spieler + " hat gewonnen!\n");
                } else {
                    System.out.println("Unentschieden!\n");
                }
            }

        } while (iEingabe != 2);

    }


    //Funktion ob gewonnen
    public static boolean hatGewonnen(String[][] spielfeld, String symbol) {
        for (int i = 0; i < 3; i++) {
            if (spielfeld[i][0].equals(symbol) && spielfeld[i][1].equals(symbol) && spielfeld[i][2].equals(symbol)) {
                return true; // Horizontal
            }
            if (spielfeld[0][i].equals(symbol) && spielfeld[1][i].equals(symbol) && spielfeld[2][i].equals(symbol)) {
                return true; // Vertikal
            }
        }
        if (spielfeld[0][0].equals(symbol) && spielfeld[1][1].equals(symbol) && spielfeld[2][2].equals(symbol)) {
            return true; // Diagonal (von links oben nach rechts unten)
        }
        if (spielfeld[0][2].equals(symbol) && spielfeld[1][1].equals(symbol) && spielfeld[2][0].equals(symbol)) {
            return true; // Diagonal (von rechts oben nach links unten)
        }
        return false;
}


    // das Spielfeld
    private static void zeigeSpielfeld(String[][] spielfeld) {
        System.out.println("   0 1 2");
        System.out.print(0 + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print("|" + spielfeld[0][j] + "");
        }
        System.out.println("|");
        System.out.print(1 + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print("|" + spielfeld[1][j] + "");
        }
        System.out.println("|");
        System.out.print(2 + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print("|" + spielfeld[2][j] + "");
        }
        System.out.println("|");
    }
}
