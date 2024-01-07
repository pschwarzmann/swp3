package S14_oop_geometrische_figuren;

public class TestIt {
    public static void main(String[] args) {
        Kreis kreis1 = new Kreis("K1",2);
        Quadrat quadrat1 = new Quadrat(4,"Q1");
        Viereck viereck1 = new Viereck(7,"V1",5);
        Würfel würfel1 =new Würfel(56,"W1",78,89);

        würfel1.getArea(45,34,53);
        kreis1.getArea(6);
        viereck1.getArea(3,4);
        quadrat1.getArea(5);
    }
}