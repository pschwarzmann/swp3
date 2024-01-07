package S13_oop_konto;

public class Bank {

    private Sparbuch sparbuch;
    private Girokonto girokonto;
    private Kreditkonto kreditkonto;




    //constructor
    public Bank(Sparbuch sparbuch, Girokonto girokonto, Kreditkonto kreditkonto) {
        this.sparbuch = sparbuch;
        this.girokonto = girokonto;
        this.kreditkonto = kreditkonto;
    }



    public void Einzahlen(String x, double betrag){
        if ("sparbuch".equals(x)) {
            double y = getSparbuch().getSparbuchValue() + betrag;
            System.out.println(betrag + " wurde in Ihr Sparbuch eingezahlt.");
            getSparbuch().setSparbuchValue(y);
        } else if ("girokonto".equals(x)) {
            double y = getGirokonto().getGirokontoValue() + betrag;
            System.out.println(betrag + " wurde in Ihr Girokont eingezahlt.");
            getGirokonto().setGirokontoValue(y);
        } else if ("kreditkonto".equals(x)) {
            double y = getKreditkonto().getKreditkontoValue() + betrag;
            if (y < getKreditkonto().getKreditkontoLimit()) {
                System.out.println(betrag + " wurde in Ihr Kreditkonto eingezahlt.");
            } else {
                System.out.println("Sie haben zu wenig Schulden um so viel Geld einzuzahlen.");
            }
        } else {
            System.out.println("Kein gültiges Konto!");
        }
    }

    public void Auszahlen(String x, double betrag){
        if ("sparbuch".equals(x)) {
            double y = getSparbuch().getSparbuchValue() - betrag;
            if (y < 0) {
                System.out.println("Sie haben zu viel ausgezahlt.");
            } else {
                System.out.println(betrag + " wurde ausgezahlt.");
                getSparbuch().setSparbuchValue(y);
            }
        } else if ("girokonto".equals(x)) {
            double y = getGirokonto().getGirokontoValue() - betrag;
            if (y < getGirokonto().getGirokontoLimit()) {
                System.out.println("Sie haben zu viel ausgezahlt.");
            } else {
                System.out.println(betrag + " wurde ausgezahlt.");
                getGirokonto().setGirokontoValue(y);
            }
        } else if ("kreditkonto".equals(x)) {
            double y = getKreditkonto().getKreditkontoValue() - betrag;
            System.out.println(betrag + " wurde ausgezahlt.");
            getKreditkonto().setKreditkontoValue(y);
        } else {
            System.out.println("Kein gültiges Konto!");
        }
    }

    public void Saldo(String x){
        if ("sparbuch".equals(x)) {
            System.out.println(getSparbuch().getSparbuchValue());
        } else if ("girokonto".equals(x)) {
            System.out.println(getGirokonto().getGirokontoValue());
        } else if ("kreditkonto".equals(x)) {
            System.out.println(getKreditkonto().getKreditkontoValue());
        } else {
            System.out.println("Kein gültiges Konto!");
        }
    }






    //getter setter
    public Sparbuch getSparbuch() {
        return sparbuch;
    }

    public void setSparbuch(Sparbuch sparbuch) {
        this.sparbuch = sparbuch;
    }

    public Girokonto getGirokonto() {
        return girokonto;
    }

    public void setGirokonto(Girokonto girokonto) {
        this.girokonto = girokonto;
    }

    public Kreditkonto getKreditkonto() {
        return kreditkonto;
    }

    public void setKreditkonto(Kreditkonto kreditkonto) {
        this.kreditkonto = kreditkonto;
    }
}
