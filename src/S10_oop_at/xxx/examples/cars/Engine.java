package S10_oop_at.xxx.examples.cars;

class Motor {
    private String typ;
    private int leistung;

    public Motor(String typ, int leistung) {
        this.typ = typ;
        this.leistung = leistung;
    }

    public String getTyp() {
        return typ;
    }

    public int getLeistung() {
        return leistung;
    }
}