package S08_oop_auto;

import java.util.Scanner;

public class TestIT {

    public static void main(String[] args) {

        //Deklaration
        double dFaktor = 0.10;
        Scanner scanner = new Scanner(System.in);
        int iEingabe = 0;
        int iAmountofRepetitions = 0;


        //Ausgabe Auto
        Auto auto = new Auto();
        auto.setiLeistung(200);
        auto.setiFuel();
        auto.setsBrand("Porsche");
        auto.setsSerialnumber("AC1234");
        auto.setiFualkap(300);
        auto.setsHonk("");


        //Menü
        System.out.println("--------------------------Menue--------------------------");
        System.out.println("Was moechten Sie machen?");
        System.out.println("1 - Auto\n2 - Turboboost \n3 - Hupen");
        System.out.print("->");
        iEingabe = scanner.nextInt();


        //Autodaten
        if (iEingabe == 1){
            System.out.println();
        };

        // Turboboost
        if (iEingabe == 2){
            System.out.println("Wie viel Tank ist im Auto(bis 300 Liter möglich))");
            auto.setiFuel = scanner.nextInt();
            if (auto.getiFuel() > auto.getiFualkap()*dFaktor){
                System.out.println("SuperBoostMode!");
            }
            else {
                System.out.println("Not enough fuel!");
            }
        }


        //Hupen
        if (iEingabe == 3){
            System.out.println("Wie viel mal möchten Sie Hupen?");
            iAmountofRepetitions = scanner.nextInt();
            for (int i = 0; i < iAmountofRepetitions; i++){
                System.out.println("Tuut");
            }
        }

    }
}
