package S15_oop_handy;

class SIM {
    private int id;
    private String nummer;


    //constructor
    public SIM(int id, String nummer) {
        this.id = id;
        this.nummer = nummer;
    }



    public void Sim(int id, String nummer) {
        System.out.println(id);
        System.out.println(nummer);
    }

    public void Anrufen(String nummer) {
        System.out.println("Folgende Nummer wird nun angerufen: " + nummer);
        System.out.println("...");
    }




    //getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
}