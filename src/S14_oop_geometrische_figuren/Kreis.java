package S14_oop_geometrische_figuren;


public class Kreis {

    private String name;
    private double radius;

    //constructor
    public Kreis(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public Kreis(double radius) {
        this.radius = radius;
    }





    public void getArea(double radius){
        double area = 2 * radius * 3.14159;
        System.out.println("Flächeninhalt:  " + area);
    }





    //Getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
