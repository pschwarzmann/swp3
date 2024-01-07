package S12_oop_rechner;

public class TestIt {
    public static void main(String[] args) {
        Rechner rechner = new Rechner(1446,53);
        Wissenschaftlicherrechner wissenschaftlicherrechner = new Wissenschaftlicherrechner(51340,4565,465);
        Wurzelrechner wurzelrechner = new Wurzelrechner(78640075,56342,7273);

        //rechner
        rechner.addieren();
        rechner.subtrahieren();
        rechner.dividieren();
        rechner.multiplizieren();

        //wissenschafftlicher rechner
        wissenschaftlicherrechner.cosinus();
        wissenschaftlicherrechner.sinus();

        //wurzelrechner
        wurzelrechner.Wurzelrechnen();
    }
}
