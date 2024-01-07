package S14_oop_geometrische_figuren;


public class Viereck extends Quadrat{

    private int seiteB;


    //constructor
    public Viereck(int seiteA, String name, int seiteB) {
        super(seiteA, name);
        this.seiteB = seiteB;
    }





    public void getArea(int seiteA, int seiteB){
        int area = seiteA * seiteB;
        System.out.println("Flächeninhalt:  " + area);
    }





    //getter setter
    public int getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(int seiteB) {
        this.seiteB = seiteB;
    }
}
