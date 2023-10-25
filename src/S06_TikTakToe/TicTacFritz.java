

package S06_TikTakToe;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacFritz {


    public static void main(String[] args) {



        int iAuswahl = ' ';
        int iÜberprüfung = 0;
        int ibeendet = 0;
        int isieg = 0;
        int iunentschieden = 0;
        Scanner scanner = new Scanner(System.in);

        int[]  iumgewandelt = new int[2];
        char[][] cboard = new char[3][3];
        int[][] ifrei = new int [3][3];



        for (int i = 0; i < cboard.length; i++) {
            for (int j = 0; j < cboard.length; j++) {
                cboard[i][j] = ' ';
            }
        }

        for (int i = 0; i < ifrei.length; i++) {
            for (int j = 0; j < ifrei.length; j++) {
                ifrei[i][j] = 0;
            }
        }



        System.out.println("Geben sie abwechselnd die Zeilen an.");
        System.out.println("1|2|3\n"  +
                "4|5|6\n" +
                "7|8|9\n");


        do {

            anzeigeSpielfeld(cboard);

            System.out.println("Der erste Spieler mit dem X ist dran, wo möchten sie es hinsetzen");
            System.out.print("->");


            do {


                iAuswahl = scanner.nextInt();

                iÜberprüfung = isavailable(ifrei, iAuswahl);

                if (iÜberprüfung == 0) {



                    iumgewandelt = umwandeln(iAuswahl);

                    ifrei[iumgewandelt[0]][iumgewandelt[1]] = 1;

                    cboard[iumgewandelt[0]][iumgewandelt[1]] = 'X';

                    anzeigeSpielfeld(cboard);

                    ibeendet = 1;

                    iunentschieden += 1;

                } else if (iÜberprüfung == 1) {


                    System.out.println("Sie haben in diesem Feld bereits ein X platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr X platzieren wollen");

                } else if (iÜberprüfung == 2) {


                    System.out.println("Der andere Spieler hat bereits ein O in diesem Feld platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr X platzieren wollen");

                }

            } while (ibeendet != 1);
            ibeendet = 0;


            isieg = gewonnen(ifrei);



            if(ibeendet == 9 | isieg == 1){



            }else {
                System.out.println("Der zweite Spieler mit dem O ist dran, wo möchten sie es hinsetzen ");
                System.out.print("->");
                do {


                    iAuswahl = scanner.nextInt();


                    iÜberprüfung = isavailable(ifrei, iAuswahl);


                    if (iÜberprüfung == 0) {

                        iumgewandelt = umwandeln(iAuswahl);
                        ifrei[iumgewandelt[0]][iumgewandelt[1]] = 2;
                        cboard[iumgewandelt[0]][iumgewandelt[1]] = 'O';

                        ibeendet = 1;

                        iunentschieden += 1;

                    } else if (iÜberprüfung == 1) {

                        System.out.println("Der andere Spieler hat bereits ein X in diesem Feld platziert");

                        System.out.println("Geben sie das Feld an in dem sie das O platzieren wollen");
                    } else if (iÜberprüfung == 2) {
                        System.out.println("Sie haben in diesem Feld bereits ein O platziert");
                        System.out.println("Geben sie eine neue Zahl ein, an der sie ihr O platzieren wollen");
                    }
                } while (ibeendet != 1);

                ibeendet = 0;
                isieg = gewonnen(ifrei);
            }

        }while(isieg == 0 && iunentschieden < 9);

        if(isieg == 1){
            System.out.println("Der Spieler mit dem X hat gewonnen");
        }else if (isieg == 0){

            System.out.println("Der Spieler mit der O hat gewonnen");

        }else {

            System.out.println("Es ist ein Unentschieden");
        }

    }



    public static void anzeigeSpielfeld (char[][] Spielfeld){
        for ( int i = 0; i < Spielfeld.length; i ++){
            System.out.println("|" +  Spielfeld[i][0] + "|" +  Spielfeld[i][1] +  "|" +  Spielfeld[i][2] + "|");
        }
    }

    public static int isavailable (int[][] Spielfeld, int Zahl) {
        int iZahl = Zahl;
        int iErgebnis = 0;
        int[] iArray = new int[2];

        iArray = umwandeln(iZahl);


        if (Spielfeld[iArray[0]][iArray[1]] == 0) {
            iErgebnis = 0;

        } else if (Spielfeld[iArray[0]][iArray[1]] == 1) {
            iErgebnis = 1;
        } else {
            iErgebnis = 2;
        }
        return iErgebnis;
    }



    public static int[] umwandeln (int Zahl){

        int iZeile = 0;
        int iSpalte = 0;
        int[] iumgewandelt = new int[2];

        switch (Zahl) {
            case 1:
                iZeile = 0;
                iSpalte = 0;
                break;
            case 2:
                iZeile = 0;
                iSpalte = 1;
                break;
            case 3:
                iZeile = 0;
                iSpalte = 2;

                break;
            case 4:
                iZeile = 1;
                iSpalte = 0;
                break;
            case 5:
                iZeile = 1;
                iSpalte = 1;
                break;
            case 6:
                iZeile = 1;
                iSpalte = 2;

                break;
            case 7:
                iZeile = 2;
                iSpalte = 0;
                break;
            case 8:
                iZeile = 2;
                iSpalte = 1;
                break;
            case 9:
                iZeile = 2;
                iSpalte = 2;
                break;
        }
        iumgewandelt[0] = iZeile;
        iumgewandelt[1] = iSpalte;
        return  iumgewandelt;
    }


    public static int gewonnen (int[][] iAvailable){

        int isieg = 0;


        if(iAvailable[0][0] == 1 && iAvailable[1][1] == 1 && iAvailable[2][2] == 1){
            isieg = 1;

        } else if (iAvailable[0][2] == 1 && iAvailable[1][1] == 1 && iAvailable[2][0] == 1) {
            isieg = 1;

        } else if (iAvailable[0][0] == 1 && iAvailable[0][1] == 1 && iAvailable[0][2] == 1) {
            isieg = 1;

        }else if (iAvailable[1][0] == 1 && iAvailable[1][1] == 1 && iAvailable[1][2] == 1) {
            isieg = 1;

        }else if (iAvailable[2][0] == 1 && iAvailable[2][1] == 1 && iAvailable[2][2] == 1) {
            isieg = 1;

        }else if (iAvailable[0][0] == 1 && iAvailable[1][0] == 1 && iAvailable[2][0] == 1) {
            isieg = 1;

        }else if (iAvailable[0][1] == 1 && iAvailable[1][1] == 1 && iAvailable[2][1] == 1) {
            isieg = 1;

        }else if (iAvailable[0][2] == 1 && iAvailable[1][2] == 1 && iAvailable[2][2] == 1) {
            isieg = 1;
        }

        if(iAvailable[0][0] == 2 && iAvailable[1][1] == 2 && iAvailable[2][2] == 2){
            isieg = 2;

        } else if (iAvailable[0][2] == 2 && iAvailable[1][1] == 2 && iAvailable[2][0] == 2) {
            isieg = 2;

        } else if (iAvailable[0][0] == 2 && iAvailable[0][1] == 2 && iAvailable[0][2] == 2) {
            isieg = 2;

        }else if (iAvailable[1][0] == 2 && iAvailable[1][1] == 2 && iAvailable[1][2] == 2) {
            isieg = 2;

        }else if (iAvailable[2][0] == 2 && iAvailable[2][1] == 2 && iAvailable[2][2] == 2) {
            isieg = 2;

        }else if (iAvailable[0][0] == 2 && iAvailable[1][0] == 2 && iAvailable[2][0] == 2) {
            isieg = 2;

        }else if (iAvailable[0][1] == 2 && iAvailable[1][1] == 2 && iAvailable[2][1] == 2) {
            isieg = 2;

        }else if (iAvailable[0][2] == 2 && iAvailable[1][2] == 2 && iAvailable[2][2] == 2) {
            isieg = 2;
        }

        return  isieg;
    };





}