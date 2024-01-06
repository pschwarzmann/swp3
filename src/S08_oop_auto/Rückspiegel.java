package S08_oop_auto;

public class Rückspiegel {

    private String Rückspiegel1;
    private String Rückspiegel2;
    private String HerstellerRückspiegel;


    //Constructor

    public Rückspiegel(String rückspiegel1, String rückspiegel2, String herstellerRückspiegel) {
        Rückspiegel1 = rückspiegel1;
        Rückspiegel2 = rückspiegel2;
        HerstellerRückspiegel = herstellerRückspiegel;
    }

    //getter setter

    public String getRückspiegel1() {
        return Rückspiegel1;
    }

    public void setRückspiegel1(String rückspiegel1) {
        Rückspiegel1 = rückspiegel1;
    }

    public String getRückspiegel2() {
        return Rückspiegel2;
    }

    public void setRückspiegel2(String rückspiegel2) {
        Rückspiegel2 = rückspiegel2;
    }

    public String getHerstellerRückspiegel() {
        return HerstellerRückspiegel;
    }

    public void setHerstellerRückspiegel(String herstellerRückspiegel) {
        HerstellerRückspiegel = herstellerRückspiegel;
    }
}