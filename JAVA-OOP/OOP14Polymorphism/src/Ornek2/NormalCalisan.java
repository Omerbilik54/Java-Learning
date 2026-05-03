package Ornek2;

// Normal çalışan, ekstra bir şey yok
public class NormalCalisan extends Calisan {

    public NormalCalisan(String isim, double maas) {
        super(isim, maas); // Üst sınıf constructor çağrılır
    }

    // Override
    @Override
    public double maasHesapla() {
        // Normal çalışan sadece maaş alır
        return maas;
    }
}

