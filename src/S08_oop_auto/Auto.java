package S08_oop_auto;

import java.util.Scanner;

public class Auto {

    private int iLeistung;
    private String sBrand;
    private String sSerialnumber;
    private String sHonk;
    private int iRemainingRange;
    private Engine engine;
    private Tank tank;

    public Auto(int iLeistung, String sBrand, String sSerialnumber, String sHonk, int iRemainingRange) {
        this.iLeistung = iLeistung;
        this.sBrand = sBrand;
        this.sSerialnumber = sSerialnumber;
        this.sHonk = sHonk;
        this.iRemainingRange = iRemainingRange;
    }

    public Auto() {

    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
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

    public String getsHonk() {
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
}