package Ornek2;

public class Mudur extends Calisan {

    private double prim;

    public Mudur(String isim, double maas, double prim) {
        super(isim, maas);
        this.prim = prim;
    }

    // Override
    @Override
    public double maasHesapla() {
        // Müdür maaş + prim alır
        return maas + prim;
    }
}
//Polimorfizmin özü bu.