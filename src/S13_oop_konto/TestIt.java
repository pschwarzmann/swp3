package S13_oop_konto;

public class TestIt {

    public static void main(String[] args) {
        Sparbuch sparbuch = new Sparbuch(200);
        Girokonto girokonto = new Girokonto(200, -150);
        Kreditkonto kreditkonto = new Kreditkonto(-1430,0);
        Bank bank = new Bank(sparbuch,girokonto,kreditkonto);

        bank.Einzahlen("sparbuch",270);
        bank.Einzahlen("girokonto",40);
        bank.Einzahlen("kreditkonto",1900);

        bank.Auszahlen("sparbuch",490);
        bank.Auszahlen("girokonto",280);
        bank.Auszahlen("kreditkonto",250);

        bank.Saldo("sparbuch");
        bank.Saldo("girokonto");
        bank.Saldo("kreditkonto");
    }
}
