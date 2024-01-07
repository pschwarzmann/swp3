package S13_oop_konto;

public class Kreditkonto {

    private double kreditkontoValue;
    private double KreditkontoLimit;



    //constructor
    public Kreditkonto(double kreditkontoValue, double kreditkontoLimit) {
        this.kreditkontoValue = kreditkontoValue;
        KreditkontoLimit = kreditkontoLimit;
    }




    //getter setter
    public double getKreditkontoValue() {
        return kreditkontoValue;
    }
    public void setKreditkontoValue(double kreditkontoValue) {
        this.kreditkontoValue = kreditkontoValue;
    }
    public double getKreditkontoLimit() {
        return KreditkontoLimit;
    }
    public void setKreditkontoLimit(double kreditkontoLimit) {
        KreditkontoLimit = kreditkontoLimit;
    }
}