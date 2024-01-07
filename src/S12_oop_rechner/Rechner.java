package S12_oop_rechner;

public class Rechner {


    private double zahl1;
    private double zahl2;



    //constructor
    public Rechner(double zahl1, double zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }




    public void addieren(){
        double Summe = this.zahl1 + this.zahl2;
        System.out.println(Summe);
    }

    public void subtrahieren(){
        double Summe = this.zahl1 - this.zahl2;
        System.out.println(Summe);
    }

    public void multiplizieren(){
        double Produkt = this.zahl1 * this.zahl2;
        System.out.println(Produkt);
    }

    public void dividieren(){
        double Quotient = this.zahl1 / this.zahl2;
        System.out.println(Quotient);
    }




    //getterandsetter
    public double getZahl1() {
        return zahl1;
    }

    public void setZahl1(double zahl1) {
        this.zahl1 = zahl1;
    }

    public double getZahl2() {
        return zahl2;
    }

    public void setZahl2(double zahl2) {
        this.zahl2 = zahl2;
    }
}
