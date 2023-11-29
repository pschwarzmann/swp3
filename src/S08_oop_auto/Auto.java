package S08_oop_auto;

public class Auto {

    private int iLeistung;
    private double iFuel;
    private String sBrand;
    private String sSerialnumber;
    private int iFualkap;
    private String sHonk;
    private int iRemainingRange;
    private String sEngine;


    public Auto(int iLeistung, double iFuel, String sBrand, String sSerialnumber, int iFualkap, String sHonk, int iRemainingRange, String sEngine) {
        this.iLeistung = iLeistung;
        this.iFuel = iFuel;
        this.sBrand = sBrand;
        this.sSerialnumber = sSerialnumber;
        this.iFualkap = iFualkap;
        this.sHonk = sHonk;
        this.iRemainingRange = iRemainingRange;
        this.sEngine = sEngine;
    }

    // Getter und Setter für die vorhandenen Attribute
    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public double getiFuel() {
        return iFuel;
    }

    public void setiFuel(double iFuel) {
        this.iFuel = iFuel;
    }

    public String getsBrand() {
        return sBrand;
    }

    public void setsBrand(String sBrand) {
        this.sBrand = sBrand;
    }

    public String getsSerialnumber() {
        return sSerialnumber;
    }

    public void setsSerialnumber(String sSerialnumber) {
        this.sSerialnumber = sSerialnumber;
    }

    public int getiFualkap() {
        return iFualkap;
    }

    public void setiFualkap(int iFualkap) {
        this.iFualkap = iFualkap;
    }

    public String getsHonk(int iAmountofRepetitions) {
        return sHonk;
    }

    public void setsHonk(String sHonk) {
        this.sHonk = sHonk;
    }

    public int getiRemainingRange() {
        return iRemainingRange;
    }

    public void setiRemainingRange(int iRemainingRange) {
        this.iRemainingRange = iRemainingRange;
    }

    public String getsHonk() {
        return sHonk;
    }

    public String getsEngine() {
        return sEngine;
    }

    public void setsEngine(String sEngine) {
        this.sEngine = sEngine;
    }
}
