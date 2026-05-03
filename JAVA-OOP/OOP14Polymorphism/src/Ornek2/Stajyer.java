package Ornek2;

public class Stajyer extends Calisan {

    public Stajyer(String isim, double maas) {
        super(isim, maas);
    }

    @Override
    public double maasHesapla() {
        // Stajyer maaşının sadece %50'sini alır
        return maas * 0.5;
    }
}

