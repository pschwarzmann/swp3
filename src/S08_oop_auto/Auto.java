package S08_oop_auto;

import java.util.ArrayList;
import java.util.List;

public class Auto {

    private int iLeistung;
    private String sBrand;
    private String sSerialnumber;
    private String sHonk;
    private int iRemainingRange;
    private List<Rückspiegel> rückspiegels;
    private List<Reifen> reifens;

// constructor
    public Auto(int iLeistung, String sBrand, String sSerialnumber, String sHonk, int iRemainingRange) {
        this.iLeistung = iLeistung;
        this.sBrand = sBrand;
        this.sSerialnumber = sSerialnumber;
        this.sHonk = sHonk;
        this.iRemainingRange = iRemainingRange;
        this.rückspiegels = new ArrayList<>();
        this.reifens = new ArrayList<>();
    }

    public void addRückspiegel(Rückspiegel rückspiegel){
        this.rückspiegels.add(rückspiegel);
    }

    public void addReifen(Reifen reifen){
        this.reifens.add(reifen);
    }


    //getter setter
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

    public List<Rückspiegel> getRückspiegel() {
        return rückspiegels;
    }

    public void setRückspiegel(List<Rückspiegel> rückspiegel) {
        this.rückspiegels = rückspiegel;
    }

    public List<Rückspiegel> getRückspiegels() {
        return rückspiegels;
    }

    public void setRückspiegels(List<Rückspiegel> rückspiegels) {
        this.rückspiegels = rückspiegels;
    }

    public List<Reifen> getReifens() {
        return reifens;
    }

    public void setReifens(List<Reifen> reifens) {
        this.reifens = reifens;
    }
}