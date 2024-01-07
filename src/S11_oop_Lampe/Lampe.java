package S11_oop_Lampe;

import java.util.ArrayList;



public class Lampe {
    private ArrayList<Element> elemente;




    //constructor
    public Lampe() {
        this.elemente = new ArrayList<>();
    }

    public void addElement(Element elements){this.elemente.add(elements);}





    public void turnOn(){

        if(elemente != null){
            for(Element element : elemente){

                element.powerState();
                if(!element.getstate()){
                    element.setstate(true);
                }
            }
        }
    }

    public void turnAllOn(){
        for(Element element : elemente){
            element.setstate(true);
        }
        System.out.println("Es wurden alle eingeschaltet");
    }

    public double OverallPowerUsage(){
        double overallPowerusage = 0;

        for(Element element : elemente){
            overallPowerusage = overallPowerusage + element.getPower();
        }

        return overallPowerusage;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < elemente.size(); i++) {
            System.out.println("ich bin " + elemente.get(i).getName());
        }
    }





    //getter and setter
    public ArrayList<Element> getElements() {
        return elemente;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elemente = elements;
    }
}
