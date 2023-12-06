package S08_oop_auto;

public class Engine {
    private int iEngine;

    public Engine(int iEngine) {
        this.iEngine = iEngine;
    }

    public Engine() {

    }

    public int getiEngine() {
        return iEngine;
    }

    public void setiEngine(int iEngine) {
        this.iEngine = iEngine;
    }
}