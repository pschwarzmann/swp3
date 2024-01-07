package S12_oop_rechner;

public class Wurzelrechner extends Wissenschaftlicherrechner{



    public Wurzelrechner(double zahl1, double zahl2, double zahl3) {
        super(zahl1, zahl2, zahl3);
    }



    public void Wurzelrechnen(){
        double Wurzel = Math.sqrt(getZahl1()+getZahl2()+getZahl3());
        System.out.println(Wurzel);
    }
}