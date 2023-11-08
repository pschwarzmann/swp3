package S07_oop;

public class TestIt {

    public static void main(String[] args){
        Auto auto = new Auto();
        Auto auto1 = new Auto();
        Fahrrad fahrrad = new Fahrrad(300, "Schwarz", "Cube");
        Getränkekiste getränkekiste = new Getränkekiste(12, "cola", "Vo Üs");

        //Auto
        System.out.println("Wie viel PS hat das Auto?");
        auto.setiLeistung(300);
        System.out.println(auto.getiLeistung());
        System.out.println("Welche Farbe hat das Auto?");
        auto.setsFarbe("Rot");
        System.out.println("Rot \n");


       //Koferraum Auto Fahrrad
        System.out.println("Was für ein Fahrrad ist im Kofferraum?:");
        auto.setKofferraumfahrrad(fahrrad);
        System.out.println(auto.getsFarbe());
        System.out.println(auto.getKofferraumfahrrad().getsMarke());

        //Koferraum Auto getränke
        System.out.println("Was für eine Getränkekiste ist im Kofferraum");
        auto.setKofferaumgetränkekiste(getränkekiste);
        System.out.println(auto.getKofferaumgetränkekiste().getsMarke());
        System.out.println(auto.getKofferaumgetränkekiste().getiAnzahlFlaschen() + " Flaschen");
        System.out.println(auto.getKofferaumgetränkekiste().getsGetränke() + "\n" + "\n");


        //Fahrrad
        System.out.println("Was ist es für ein Fahrrad?:");
        fahrrad.setsFarbe("Rot");
        fahrrad.setsMarke("KTM");
        System.out.println(fahrrad.getsFarbe());
        System.out.println(fahrrad.getsMarke() + "\n");


        //Getränke kiste
        System.out.println("Was ist in der Getränkekiste?:");
        getränkekiste.setiAnzahlFlaschen(10);
        getränkekiste.setsGetränke("Cola");
        getränkekiste.setsMarke("Vo Üs");
        System.out.println(getränkekiste.getiAnzahlFlaschen());
        System.out.println(getränkekiste.getsGetränke());
        System.out.println(getränkekiste.getsMarke());
    }
}
