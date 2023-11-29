package S08_oop_auto;

import java.util.Scanner;

public class TestIT {

    public static void main(String[] args) {

        //Ausgabe Auto
        Auto auto = new Auto();
        auto.setiLeistung(200);
        auto.setiFuel();
        auto.setsBrand("Porsche");
        auto.setsSerialnumber("AC1234");
        auto.setiFualkap(300);
        auto.setsHonk("");
        auto.setiRemainingRange(0);


        //Deklaration
        double dFaktor = 0.10;
        Scanner scanner = new Scanner(System.in);
        int iEingabe = 0;
        int iAmountofRepetitions = 0;
        int inEingabe = 0;
        double fVerbrauchsfaktor = 9.17;



        do {
            //Autodaten
            System.out.println("--------------------------Menue + Autodaten----------------------------");
            System.out.println("Das Auto hat " + auto.getiLeistung() + " PS.");
            System.out.println("Die Auto Marke lautet " + auto.getsBrand() + ".");
            System.out.println("Die Auto Seriennummer lautet " + auto.getsSerialnumber() + ".");
            System.out.println("Die Auto Tankkappazität liegt bei " + auto.getiFualkap() + " Liter.");
            System.out.println("-----------------------------------------------------------------------");
            //Tanken
            System.out.println("Wie viel Tank möchten sie ins Auto füllen(bis 300 Liter möglich)?");
            System.out.print("->");
            double dtest = scanner.nextDouble();
            if (dtest > 300){
                System.out.println("Sie haben zu viel getankt(der Stand bleibt bei 300 Litern)!");
                auto.setiFuel(300);
            };
            double dTankpreis = 1.5 * dtest;
            auto.setiFuel((int) dtest);
            System.out.println("Sie Zahlen " + dTankpreis + " €!");
            System.out.println("-----------------------------------------------------------------------");
            //Verweisung zum Menü
            System.out.println("Wenn sie die Daten gelesen haben und den Tank befüllt haben\ndrücken Sie die 0:");
            System.out.print("->");
            inEingabe = scanner.nextInt();
        }while(inEingabe != 0);

     do {
         //Menü
         System.out.println("---------------------------------Menue---------------------------------");
         System.out.println("Was moechten Sie machen?(Sie haben " + auto.setiFuel+ " Liter Tank)");
         System.out.println("0 - Abbruch\n1 - Turboboost\n2 - Hupen\n3 - mögliche Reichweite ausfahren");
         System.out.print("->");
         iEingabe = scanner.nextInt();


         // Turboboost
         if (iEingabe == 1){
             if (auto.setiFuel > auto.getiFualkap() *dFaktor)
                 System.out.println("SuperBoostMode!");
             else {
                 System.out.println("Not enough fuel!");
             }
         }


         //Hupen
         if (iEingabe == 2){
             System.out.println("Wie viel mal möchten Sie Hupen?");
             iAmountofRepetitions = scanner.nextInt();
             for (int i = 0; i < iAmountofRepetitions; i++){
                 System.out.println("Tuut");
             }
         }

         //mögliche Reichweite
         if (iEingabe== 3){
             auto.setiRemainingRange((int) (auto.setiFuel * fVerbrauchsfaktor));
             System.out.println("Das Auto kann mit diesem Tank noch " + auto.getiRemainingRange() + " km weit fahren.");
         };

     }while(iEingabe != 0);


    }
}
