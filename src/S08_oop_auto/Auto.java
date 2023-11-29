package S08_oop_auto;

public class Auto {

    public double setiFuel;
    private int iLeistung = 0;

    private double iFuel = 0;

    private String sBrand = "";

    private String sSerialnumber = "";

    private int iFualkap = 300;

    private String sHonk = "";

    private int iRemainingRange = 0;

    //get und setter


    public double getSetiFuel() {
        return setiFuel;
    }

    public void setSetiFuel(double setiFuel) {
        this.setiFuel = setiFuel;
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

    public void setsHonk(String sHonk) {
        this.sHonk = sHonk;
    }

    public int getiFualkap() {
        return iFualkap;
    }

    public void setiFualkap(int iFualkap) {
        this.iFualkap = iFualkap;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public double getiFuel() {
        return iFuel;
    }

    public void setiFuel() {
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

    public void setiFuel(int i) {
    }
}
