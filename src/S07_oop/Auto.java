package S07_oop;

public class Auto {
    private int iLeistung = 0;
    private String sFarbe = "Keine Farbe";
    private Fahrrad Kofferraumfahrrad;
    private Getränkekiste Kofferaumgetränkekiste;

    public Auto(int iLeistung, String sFarbe, Fahrrad kofferraumfahrrad, Getränkekiste kofferaumgetränkekiste) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        Kofferraumfahrrad = kofferraumfahrrad;
        Kofferaumgetränkekiste = kofferaumgetränkekiste;
    }

    public Getränkekiste getKofferaumgetränkekiste() {
        return Kofferaumgetränkekiste;
    }

    public void setKofferaumgetränkekiste(Getränkekiste kofferaumgetränkekiste) {
        Kofferaumgetränkekiste = kofferaumgetränkekiste;
    }

    public Fahrrad getKofferraumfahrrad() {
        return Kofferraumfahrrad;
    }

    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        Kofferraumfahrrad = kofferraumfahrrad;
    }

    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }
}
