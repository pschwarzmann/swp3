package S16_oop_Kamera;

public class Linse {
    private int pixel;
    private int größe;


    //constructor
    public Linse(int pixel) {
        this.pixel = pixel;
    }



    public int dateigröße(){
        switch(pixel){
            case 2000:
                größe = 2;
                break;
            case 4000:
                größe = 4;
                break;
            case 6000:
                größe = 6;
                break;
            default:
                break;
        }
        return größe;
    }



    //getter setter
    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }
}