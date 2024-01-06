package S10_oop_at.xxx.examples.cars;

class Auto {
    private String farbe;
    private int maxGeschwindigkeit;
    private double basispreis;
    private double basisverbrauch;
    private Hersteller hersteller;
    private Motor motor;

    public Auto(String farbe, int maxGeschwindigkeit, double basispreis, double basisverbrauch,
                Hersteller hersteller, Motor motor) {
        this.farbe = farbe;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.basispreis = basispreis;
        this.basisverbrauch = basisverbrauch;
        this.hersteller = hersteller;
        this.motor = motor;
    }

    public double berechnePreis() {
        double rabatt = hersteller.getRabatt();
        return basispreis * (1 - rabatt / 100);
    }

    public double berechneVerbrauch(int gefahreneKilometer) {
        if (gefahreneKilometer <= 50000) {
            return basisverbrauch * gefahreneKilometer;
        } else {
            double ueberschreitungsFaktor = 1.098; // 9.8 Prozent Erhöhung
            return basisverbrauch * 50000 + basisverbrauch * ueberschreitungsFaktor * (gefahreneKilometer - 50000);
        }
    }

    public void zeigeInformationen() {
        System.out.println("Farbe: " + farbe);
        System.out.println("Maximale Geschwindigkeit: " + maxGeschwindigkeit + " km/h");
        System.out.println("Basispreis: " + basispreis + " Euro");
        System.out.println("Basisverbrauch: " + basisverbrauch + " Liter/km");
        System.out.println("Aktueller Preis (mit Rabatt): " + berechnePreis() + " Euro");
        System.out.println("Gesamter Verbrauch: " + berechneVerbrauch(75000) + " Liter"); // Beispielwert 75000 km
        System.out.println("Hersteller: " + hersteller.getName() + ", Herkunftsland: " + hersteller.getHerkunftsland() +
                ", Rabatt: " + hersteller.getRabatt() + "%");
        System.out.println("Motor: " + motor.getTyp() + ", Leistung: " + motor.getLeistung() + " PS");
    }
}
