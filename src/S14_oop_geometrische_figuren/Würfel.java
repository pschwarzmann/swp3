package S14_oop_geometrische_figuren;


public class Würfel extends Viereck{
    private int hoeheC;



    //constructor
    public Würfel(int seiteA, String name, int seiteB, int hoeheC) {
        super(seiteA, name, seiteB);
        this.hoeheC = hoeheC;
    }




    public void getArea(int seiteA, int seiteB, int hoeheC){
        int area = seiteA * seiteB * hoeheC;
        System.out.println("Flächeninhalt:  " + area);
    }





    //getter setter
    public int getHoeheC() {
        return hoeheC;
    }

    public void setHoeheC(int hoeheC) {
        this.hoeheC = hoeheC;
    }
}
