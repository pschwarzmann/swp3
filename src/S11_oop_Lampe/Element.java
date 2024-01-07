package S11_oop_Lampe;

public class Element {
    private String name;
    private String color;
    private int power;
    private boolean state;



    //constructor
    public Element(String name, String color, int power, boolean state) {
        this.name = name;
        this.color = color;
        this.power = power;
        this.state = state;
    }




    public void powerState(){
        if (state) {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschaltet!");
        }else{
            setPower(getPower()+5);
            System.out.println("Mein Name ist " + this.name + ". Ich bin jetzt eingeschaltet!");
        }
    }




    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean getstate() {
        return state;
    }

    public void setstate(boolean on) {
        state = on;
    }
}