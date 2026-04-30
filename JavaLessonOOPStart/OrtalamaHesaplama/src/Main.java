import java.util.*;

public class Main {

    static class Ders {
        String ad;
        double kredi; // Kredi veya AKTS (Hangisini kullanıyorsanız)
        double akts; // AKTS'yi de tutmaya devam edelim

        Ders(String ad, double kredi, double akts) {
            this.ad = ad;
            this.kredi = kredi;
            this.akts = akts;
        }
    }

    // Harf notunu 4’lük sisteme çeviren fonksiyon
    public static double harfToNot(String harf) {
        return switch (harf.toUpperCase()) {
            case "AA" -> 4.0;
            case "BA" -> 3.5;
            case "BB" -> 3.0;
            case "CB" -> 2.5;
            case "CC" -> 2.0;
            case "DC" -> 1.5;
            case "DD" -> 1.0;
            case "FF" -> 0.0;
            case "S" -> -2; // Başarılı (Krediye katılmaz)
            case "U" -> -3; // Başarısız (Krediye katılmaz)
            default -> -1; // Geçersiz giriş
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Senin verdiğin tüm ders listesi
        // Bu dersler varsayımsal olarak tek bir dönemdeki dersler olsun.
        List<Ders> dersler = List.of(

                new Ders("Genel Kimya", 4, 5),
                new Ders("Bilgisayar Bilimine Giriş", 3, 6),
                new Ders("Diferansiyel Denklemler", 4, 4),
                new Ders("Mesleki Yabancı Dil I", 2, 2),
                new Ders("Yazılım İnşası", 3, 5),
                new Ders("Yazılım Gereksinimleri ve Modelleme", 3, 5),
                new Ders("Nesne Yönelimli Programlama", 3, 6)
        );

        // Önceki dönem bilgileri için giriş alalım
        System.out.println("Önceki dönemlerdeki genel not ortalamanız (GPA) nedir? (Örn: 3.15): ");
        double oncekiGPA;
        if (sc.hasNextDouble()) {
            oncekiGPA = sc.nextDouble();
        } else {
            System.out.println("Geçersiz giriş. Önceki GPA 0.0 olarak kabul edildi.");
            oncekiGPA = 0.0;
            sc.next(); // Geçersiz girişi temizle
        }

        System.out.println("Önceki genel ortalamanızın hesaplandığı toplam krediniz nedir? (Başarılı/Başarısız dersler hariç): ");
        double oncekiToplamKredi;
        if (sc.hasNextDouble()) {
            oncekiToplamKredi = sc.nextDouble();
        } else {
            System.out.println("Geçersiz giriş. Önceki toplam kredi 0 olarak kabul edildi.");
            oncekiToplamKredi = 0.0;
            sc.next(); // Geçersiz girişi temizle
        }

        // Hesaplamalar
        // Önceki dönemlerin toplam not ağırlığı (toplam kredi * gpa)
        double kümülatifToplamNotAgirligi = oncekiGPA * oncekiToplamKredi;
        double kümülatifToplamKredi = oncekiToplamKredi;


        System.out.println("\n--- Yeni Dönem Dersleri İçin Not Girişi ---");
        // sc.nextLine(); // Önceki nextDouble'dan kalan new-line'ı temizle

        double mevcutDonemToplamNotAgirligi = 0;
        double mevcutDonemToplamKredi = 0;

        for (Ders d : dersler) {
            System.out.print(d.ad + ": ");
            String input = sc.next();

            double notDegeri;

            // Eğer sayı girilmişse onu 100’lükten 4’lük sisteme çevir
            if (input.matches("\\d+")) {
                int sayiNot = Integer.parseInt(input);
                if (sayiNot >= 90) notDegeri = 4.0;
                else if (sayiNot >= 85) notDegeri = 3.5;
                else if (sayiNot >= 80) notDegeri = 3.0;
                else if (sayiNot >= 70) notDegeri = 2.5;
                else if (sayiNot >= 60) notDegeri = 2.0;
                else if (sayiNot >= 50) notDegeri = 1.5;
                else if (sayiNot >= 40) notDegeri = 1.0;
                else notDegeri = 0.0;
            } else {
                notDegeri = harfToNot(input);
            }

            if (notDegeri == -1) {
                System.out.println("Geçersiz not girişi ('AA'/'BA'/sayı veya 'S'/'U'), bu ders atlandı.");
                continue;
            } else if (notDegeri == -2 || notDegeri == -3) { // 'S' veya 'U' notları
                System.out.println("Başarılı/Başarısız ders, ortalamaya dahil edilmeyecek.");
                continue; // Krediye ve not ağırlığına ekleme
            }

            mevcutDonemToplamNotAgirligi += notDegeri * d.kredi;
            mevcutDonemToplamKredi += d.kredi;
        }

        // Yeni dönem ortalamasını hesapla
        double mevcutDonemOrtalama = 0.0;
        if (mevcutDonemToplamKredi > 0) {
            mevcutDonemOrtalama = mevcutDonemToplamNotAgirligi / mevcutDonemToplamKredi;
        }

        // Kümülatif ortalamayı hesapla (Önceki + Yeni)
        double toplamNotAgirligi = kümülatifToplamNotAgirligi + mevcutDonemToplamNotAgirligi;
        double toplamKredi = kümülatifToplamKredi + mevcutDonemToplamKredi;

        double kümülatifOrtalama = 0.0;
        if (toplamKredi > 0) {
            kümülatifOrtalama = toplamNotAgirligi / toplamKredi;
        }

        System.out.println("\n--- Hesaplama Sonuçları ---");
        System.out.printf("Mevcut Dönem Ağırlıklı Ortalaması (GPA): %.2f%n", mevcutDonemOrtalama);
        System.out.printf("Toplam Başarılı Kredi (Yeni Dönem): %.0f%n", mevcutDonemToplamKredi);
        System.out.printf("Kümülatif Genel Ağırlıklı Ortalama (CGPA): %.2f%n", kümülatifOrtalama);
        System.out.printf("Toplam Kümülatif Kredi: %.0f%n", toplamKredi);
    }
}