package S08_oop_auto;

public class Reifen {

    private String Reifen1;
    private String Reifen2;
    private String Reifen3;
    private String Reifen4;
    private String ReifenHersteller;
    private double Reifenbreite;
    private String Reifenart;


    //Construcator

    public Reifen(String reifen1, String reifen2, String reifen3, String reifen4, String reifenHersteller, double reifenbreite, String reifenart) {
        Reifen1 = reifen1;
        Reifen2 = reifen2;
        Reifen3 = reifen3;
        Reifen4 = reifen4;
        ReifenHersteller = reifenHersteller;
        Reifenbreite = reifenbreite;
        Reifenart = reifenart;
    }


    //getter setter

    public String getReifen1() {
        return Reifen1;
    }

    public void setReifen1(String reifen1) {
        Reifen1 = reifen1;
    }

    public String getReifen2() {
        return Reifen2;
    }

    public void setReifen2(String reifen2) {
        Reifen2 = reifen2;
    }

    public String getReifen3() {
        return Reifen3;
    }

    public void setReifen3(String reifen3) {
        Reifen3 = reifen3;
    }

    public String getReifen4() {
        return Reifen4;
    }

    public void setReifen4(String reifen4) {
        Reifen4 = reifen4;
    }

    public String getReifenHersteller() {
        return ReifenHersteller;
    }

    public void setReifenHersteller(String reifenHersteller) {
        ReifenHersteller = reifenHersteller;
    }

    public double getReifenbreite() {
        return Reifenbreite;
    }

    public void setReifenbreite(double reifenbreite) {
        Reifenbreite = reifenbreite;
    }

    public String getReifenart() {
        return Reifenart;
    }

    public void setReifenart(String reifenart) {
        Reifenart = reifenart;
    }
}
