package S13_oop_konto;

public class Girokonto {

    private double girokontoValue;
    private double  girokontoLimit;



    //constructor
    public Girokonto(double girokontoValue, double girokontoLimit) {
        this.girokontoValue = girokontoValue;
        this.girokontoLimit = girokontoLimit;
    }




    //getter setter
    public double getGirokontoValue() {
        return girokontoValue;
    }
    public void setGirokontoValue(double girokontoValue) {
        this.girokontoValue = girokontoValue;
    }
    public double getGirokontoLimit() {
        return girokontoLimit;
    }
    public void setGirokontoLimit(double girokontoLimit) {
        this.girokontoLimit = girokontoLimit;
    }
}
