package Ornek2;

// Bu sınıf EN ÜST SINIF
// Ortak özellikler ve davranışlar burada tutulur
public class Calisan {

    // public -> alt sınıflar erişebilsin diye
    public String isim;
    public double maas;

    // Constructor
    public Calisan(String isim, double maas) {
        this.isim = isim;
        this.maas = maas;
    }

    // Bu metod POLİMORFİZME ZEMİN HAZIRLAR
    // Alt sınıflar bunu override edecek
    public double maasHesapla() {
        return maas;
    }

    // Ortak bilgi yazdırma metodu
    public void bilgiYazdir() {
        System.out.println("İsim: " + isim);
        System.out.println("Toplam Maaş: " + maasHesapla());
    }
}
//maasHesapla() override edilebilir
//
//bilgiYazdir() içinde maasHesapla() çağrılıyor
//
//Hangi maasHesapla() çalışacak?
//        👉 Nesnenin gerçek türü belirler (işte polimorfizm)
