package Ornek2;

public class Main {
    public static void main(String[] args) {

        // Henüz nesne yok ama static blok ÇALIŞTI
        // "Banka sistemi başlatıldı" yazdı

        // Nesne oluşturuyoruz
        Banka b1 = new Banka(1000);
        Banka b2 = new Banka(2000);

        // ===============================
        // STATIC DEĞİŞKENE ERİŞİM
        // ===============================

        // DOĞRU kullanım
        System.out.println(Banka.bankaAdi);

        // Toplam müşteri sayısı
        System.out.println(Banka.musteriSayisi); // 2

        // ===============================
        // NON-STATIC METOD ÇAĞRISI
        // ===============================

        b1.bilgiYazdir();
        b2.bilgiYazdir();

        // ===============================
        // STATIC METOD ÇAĞRISI
        // ===============================

        // Nesne OLMADAN çağrılır
        double faiz = Banka.faizHesapla(1000);
        System.out.println("Faiz: " + faiz);

        // ===============================
        // STATIC'İN ETKİSİ
        // ===============================

        Banka.bankaAdi = "İslam Bank";

        // Değişiklik HERKESİ etkiler
        b1.bilgiYazdir();
        b2.bilgiYazdir();
    }
}

