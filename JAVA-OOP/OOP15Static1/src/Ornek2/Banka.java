package Ornek2;

public class Banka {

    // ===============================
    // 1️⃣ STATIC DEĞİŞKEN
    // ===============================

    // static -> sınıfa ait
    // Tüm müşteriler için TEK banka adı vardır
    static String bankaAdi = "Nur Bank";

    // static -> oluşturulan toplam müşteri sayısı
    static int musteriSayisi = 0;

    // ===============================
    // 2️⃣ NON-STATIC DEĞİŞKEN
    // ===============================

    // Her nesnenin (müşterinin) kendi bakiyesi vardır
    double bakiye;

    // ===============================
    // 3️⃣ STATIC BLOK
    // ===============================

    static {
        // Bu blok sınıf belleğe YÜKLENDİĞİNDE 1 KERE çalışır
        System.out.println("Banka sistemi başlatıldı");
    }

    // ===============================
    // 4️⃣ CONSTRUCTOR
    // ===============================

    public Banka(double bakiye) {
        this.bakiye = bakiye;

        // static değişken artırılıyor
        // Çünkü müşteri sayısı HERKES için ortaktır
        musteriSayisi++;
    }

    // ===============================
    // 5️⃣ STATIC METOD
    // ===============================

    public static double faizHesapla(double bakiye) {
        // static metod -> nesneye ihtiyaç YOK
        // Bu yüzden sadece parametreyle çalışır
        return bakiye * 0.10;
    }

    // ===============================
    // 6️⃣ NON-STATIC METOD
    // ===============================

    public void bilgiYazdir() {
        // non-static metod hem static hem non-static alanlara erişebilir
        System.out.println("Banka Adı: " + bankaAdi);
        System.out.println("Bakiye: " + bakiye);
    }
}

