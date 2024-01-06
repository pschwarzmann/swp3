package S08_oop_auto;

public class Rückspiegel {

    private int Größe;
    private int Postion;


    //Constructor
    public Rückspiegel(int größe, int postion) {
        Größe = größe;
        Postion = postion;
    }

    //getter setter
    public int getGröße() {
        return Größe;
    }

    public void setGröße(int größe) {
        Größe = größe;
    }

    public int getPostion() {
        return Postion;
    }

    public void setPostion(int postion) {
        Postion = postion;
    }
}
