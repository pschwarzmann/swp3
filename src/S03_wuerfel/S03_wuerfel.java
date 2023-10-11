package S03_wuerfel;

import java.util.Random;
import java.util.Scanner;

public class S03_wuerfel {

    public static void main(String[] args) {
        Random random = new Random();


        int iEingabe = 0;
        Scanner scanner = new Scanner(System.in);
        int SiegeSpieler = 0;
        int SiegeComputer = 0;
        int Gleichstand = 0;



        do {

            System.out.println("------------------------------------Spiel:------------------------------------");
            System.out.println("Erklährung des Spiels:\n  -> Sie würfeln in 6 runden gegen einen Computer, wer die meisten Runden höher gewürfelt hat gewinnt! ");
            System.out.println("         (Um gegen den Computer zu Würfeln drücken sie die 1, um die Eingabe zu beenden eine 2)");
            iEingabe = scanner.nextInt();

            if (iEingabe == 1) {

                for (int i = 0; i < 6; i++) {
                    int Spieler = random.nextInt(6) + 1;
                    int Computer = random.nextInt(6) + 1;

                    if(Spieler>Computer){
                        SiegeSpieler++;
                    }

                    else if (Spieler<Computer) {
                        SiegeComputer++;
                    }

                    else  {
                        Gleichstand++;
                    }
                };

                if(SiegeSpieler>SiegeComputer){
                    System.out.println("------------------------------------Spiel:------------------------------------");
                    System.out.println("Sie haben "+SiegeSpieler+" Runden gewonnen, falls Sie nochmals würfeln spielen drücken Sie die 3");
                }

                else if(SiegeSpieler<SiegeComputer) {
                    System.out.println("------------------------------------Spiel:------------------------------------");
                    System.out.println("Sie haben "+SiegeComputer+" Runden verloren, falls Sie nochmals spielen wollen drücken Sie die 3");
                }

                else  {
                    System.out.println("------------------------------------Spiel:------------------------------------");
                    System.out.println("Sie haben gleichviele Runden gewonnen bzw. verloren, falls Sie nochmals spielen wollen drücken Sie die 3");
                }

                iEingabe = scanner.nextInt();
            }


        } while (iEingabe != 2);

        System.out.println("Beendet");
    }}