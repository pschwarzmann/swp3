package S10_oop_at.xxx.examples.cars;

import java.util.ArrayList;
class Auto {
    private String farbe;
    private int masgeschwindigkeit;
    private int basispreis;
    private double basisverbrauch;
    private Motor motor;
    private double gefahrenekm;
    private double echtpreis;
    private Hersteller hersteller;

    // constructor
    public Auto(String farbe, int masgeschwindigkeit, int basispreis, double basisverbrauch, Motor motor,
                double gefahrenekm) {
        this.farbe = farbe;
        this.masgeschwindigkeit = masgeschwindigkeit;
        this.basispreis = basispreis;
        this.basisverbrauch = basisverbrauch;
        this.motor = motor;
        this.gefahrenekm = gefahrenekm;
        this.echtpreis = 0;
    }

    // Preis berechnen
    public void preisberech() {
        this.echtpreis = (this.hersteller.getRabatt() / 100) * this.basispreis + this.basispreis;
        System.out.println(echtpreis);
    }

    // gefahrenekm
    public double fahren() {
        this.gefahrenekm += 40000;
        if (this.gefahrenekm > 50000) {
            this.basisverbrauch *= 1.098;
        }
        System.out.println(this.gefahrenekm);
        return this.gefahrenekm;
    }

    // getter and setter

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getMasgeschwindigkeit() {
        return masgeschwindigkeit;
    }

    public void setMasgeschwindigkeit(int masgeschwindigkeit) {
        this.masgeschwindigkeit = masgeschwindigkeit;
    }

    public int getBasispreis() {
        return basispreis;
    }

    public void setBasispreis(int basispreis) {
        this.basispreis = basispreis;
    }

    public double getBasisverbrauch() {
        return basisverbrauch;
    }

    public void setBasisverbrauch(double basisverbrauch) {
        this.basisverbrauch = basisverbrauch;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getGefahrenekm() {
        return gefahrenekm;
    }

    public void setGefahrenekm(double gefahrenekm) {
        this.gefahrenekm = gefahrenekm;
    }

    public double getEchtpreis() {
        return echtpreis;
    }

    public void setEchtpreis(double echtpreis) {
        this.echtpreis = echtpreis;
    }

    public Hersteller getHersteller() {
        return hersteller;
    }

    public void setHersteller(Hersteller hersteller) {
        this.hersteller = hersteller;
    }
}