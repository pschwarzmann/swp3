package S02_bankautomat;

import java.util.Scanner;import java.util.Scanner;

public class S02_bankautomat {
    public static void main(String[] args) {



        char cAbbruch = 'J';
        int iEingabe = 0;
        double dKonto = 0;
        double dAbheben = 0;
        double dEinzahlen = 0;
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.print("Menü:\nDrücke 1 um Einzuzahlen!\nDrücke 2 um Abzuheben!\nDrücke 3 um den Kontostand zu sehen!\nDrücke 4 um die Eingabe zu beenden!\n");
            iEingabe = scanner.nextInt();

            System.out.println();

            if(iEingabe == 1)
            {
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen wollen!:");
                dEinzahlen = scanner.nextInt();

                dKonto = dKonto + dEinzahlen;

                System.out.println();
            }


            if(iEingabe == 2)
            {
                System.out.println("Geben Sie den Betrag ein den Sie abheben wollen!:");
                dAbheben = scanner.nextInt();

                dKonto = dKonto - dAbheben;

                System.out.println();
            }


            if(iEingabe == 3)
            {
                System.out.println("Ihr Kontostand lautet:"+ dKonto + "\n");

            }


            if(iEingabe == 4)
            {
                System.out.println("Möchten Sie das Programm beenden? (Wenn Ja tippen Sie: J ansonst N)");
                cAbbruch = scanner.next().charAt(0);

                System.out.println();
            }




        }while(cAbbruch != 'J');
        System.out.print("Beendet");
    }
}