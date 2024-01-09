package S16_oop_Kamera;

public class Linse {
    private int pixel;
    private int größe;


    //constructor
    public Linse(int pixel) {
        this.pixel = pixel;
    }



    public int dateigröße() {
        if (pixel == 2000) {
            größe = 2;
        } else if (pixel == 4000) {
            größe = 4;
        } else if (pixel == 6000) {
            größe = 6;
        } else {

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