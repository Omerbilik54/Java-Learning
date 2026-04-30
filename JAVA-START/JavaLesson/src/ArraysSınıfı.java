import java.util.Arrays;
import java.util.List;

/**
 * Bu sınıf, Java'daki `java.util.Arrays` yardımcı sınıfının en sık kullanılan
 * metotlarını detaylı yorum satırları ile açıklamaktadır.
 * Her bir metot, ne işe yaradığını ve nasıl kullanıldığını gösteren
 * bir örnekle birlikte sunulmuştur.
 */
public class ArraysSınıfı {

    public static void main(String[] args) {

        System.out.println("----------- Java Arrays Sınıfı Metot Örnekleri (Detaylı Anlatım) -----------");
        System.out.println(); // Konsolda boşluk bırakmak için.

        /*
         * 1. Arrays.sort()
         * ------------------
         * Bu metot, bir dizinin elemanlarını "doğal sıralamasına" göre sıralar.
         * Sayılar için küçükten büyüğe, metinler (String) için alfabetik olarak sıralama yapar.
         * ÖNEMLİ: Bu metot, dizinin kendisini kalıcı olarak değiştirir (in-place modification).
         */
        System.out.println("1. Arrays.sort() -> Diziyi küçükten büyüğe sıralama");
        int[] sayilar = {50, 12, 9, 37, 7};
        // Dizinin sıralanmadan önceki halini görelim.
        System.out.println("Sıralanmamış dizi: " + Arrays.toString(sayilar));
        // sort() metodunu çağırarak diziyi sıralayalım.
        Arrays.sort(sayilar);
        // Dizinin sıralandıktan sonraki halini görelim.
        System.out.println("Sıralanmış dizi:   " + Arrays.toString(sayilar));
        System.out.println("----------------------------------------------------------------------");

        /*
         * 2. Arrays.toString()
         * ----------------------
         * Bu metot, bir dizinin içeriğini insan tarafından okunabilir bir String'e dönüştürür.
         * Genellikle bir dizinin elemanlarını konsola yazdırmak veya loglamak için kullanılır.
         * Eğer bu metodu kullanmazsak, `System.out.println(dizi)` komutu anlamsız bir bellek adresi basar.
         */
        System.out.println("2. Arrays.toString() -> Diziyi okunaklı bir metin olarak gösterme");
        String[] sehirler = {"Ankara", "İstanbul", "İzmir"};
        // toString() metodu sayesinde diziyi köşeli parantezler içinde, virgülle ayrılmış şekilde görürüz.
        System.out.println("Şehirler dizisi: " + Arrays.toString(sehirler)); // Çıktı: [Ankara, İstanbul, İzmir]
        System.out.println("----------------------------------------------------------------------");

        /*
         * 3. Arrays.fill()
         * ----------------
         * Bu metot, bir dizinin tüm elemanlarını belirttiğiniz tek bir değer ile doldurur.
         * Diziyi başlangıçta belirli bir varsayılan değerle başlatmak için çok kullanışlıdır.
         */
        System.out.println("3. Arrays.fill() -> Dizinin tamamını tek bir değerle doldurma");
        int[] numaralar = new int[5]; // 5 elemanlı, başlangıçta tüm elemanları 0 olan bir dizi.
        System.out.println("Doldurmadan önce (varsayılan değer 0): " + Arrays.toString(numaralar));
        // Dizinin tüm elemanlarını 10 değeri ile dolduralım.
        Arrays.fill(numaralar, 10);
        System.out.println("Doldurduktan sonra (tüm elemanlar 10): " + Arrays.toString(numaralar));
        System.out.println("----------------------------------------------------------------------");

        /*
         * 4. Arrays.binarySearch()
         * --------------------------
         * Bu metot, SIRALI BİR DİZİDE belirli bir elemanı çok hızlı bir şekilde arar.
         * Eğer eleman bulunursa, onun indeksini (sıra numarasını) döndürür.
         * Eğer eleman bulunamazsa, elemanın eklenmesi gereken yerin negatif değerini döndürür.
         * DİKKAT: Bu metodun doğru çalışması için dizi MUTLAKA ÖNCEDEN SIRALANMIŞ OLMALIDIR.
         */
        System.out.println("4. Arrays.binarySearch() -> Sıralı bir dizide hızlı arama yapma");
        int[] siraliDizi = {10, 20, 30, 40, 50};
        System.out.println("Aranacak dizi: " + Arrays.toString(siraliDizi));
        // Dizide '30' elemanını arayalım.
        int index = Arrays.binarySearch(siraliDizi, 30);
        System.out.println("Aranan '30' elemanının indeksi: " + index); // Bulunduğu için indeksi olan 2'yi döndürür.
        // Dizide olmayan '35' elemanını arayalım.
        int indexYok = Arrays.binarySearch(siraliDizi, 35);
        System.out.println("Aranan '35' elemanı bulunamadı, dönen değer: " + indexYok); // Bulunmadığı için negatif bir sayı döner.
        System.out.println("----------------------------------------------------------------------");

        /*
         * 5. Arrays.equals()
         * --------------------
         * İki dizinin içeriklerinin BİREBİR AYNI olup olmadığını kontrol eder.
         * "Birebir aynı" demek, hem elemanların aynı olması hem de aynı sırada olmaları demektir.
         */
        System.out.println("5. Arrays.equals() -> İki dizinin içeriklerinin aynı olup olmadığını kontrol etme");
        int[] dizi1 = {1, 2, 3};
        int[] dizi2 = {1, 2, 3};
        int[] dizi3 = {3, 2, 1}; // Elemanlar aynı ama sıra farklı
        System.out.println("dizi1: " + Arrays.toString(dizi1));
        System.out.println("dizi2: " + Arrays.toString(dizi2));
        System.out.println("dizi3: " + Arrays.toString(dizi3));
        // dizi1 ve dizi2 hem aynı elemanlara hem de aynı sıraya sahip.
        System.out.println("dizi1 ve dizi2 eşit mi? -> " + Arrays.equals(dizi1, dizi2)); // true
        // dizi1 ve dizi3 aynı elemanlara sahip olsa da sıraları farklı.
        System.out.println("dizi1 ve dizi3 eşit mi? -> " + Arrays.equals(dizi1, dizi3)); // false
        System.out.println("----------------------------------------------------------------------");

        /*
         * 6. Arrays.copyOf()
         * --------------------
         * Bir dizinin belirtilen uzunlukta bir kopyasını oluşturur.
         * - Eğer yeni uzunluk orijinalden kısaysa, dizi baştan itibaren kesilir.
         * - Eğer yeni uzunluk orijinalden uzunsa, fazladan eklenen elemanlar varsayılan değerle (int için 0) doldurulur.
         */
        System.out.println("6. Arrays.copyOf() -> Dizinin kopyasını oluşturma");
        int[] orijinal = {1, 2, 3, 4, 5};
        System.out.println("Orijinal dizi: " + Arrays.toString(orijinal));
        // Orijinal dizinin ilk 3 elemanından oluşan bir kopya oluşturalım.
        int[] kisaKopya = Arrays.copyOf(orijinal, 3);
        System.out.println("3 elemanlı kısa kopya: " + Arrays.toString(kisaKopya));
        // Orijinal diziden daha uzun bir kopya oluşturalım.
        int[] uzunKopya = Arrays.copyOf(orijinal, 7);
        System.out.println("7 elemanlı uzun kopya (sonu 0 ile dolduruldu): " + Arrays.toString(uzunKopya));
        System.out.println("----------------------------------------------------------------------");

        /*
         * 7. Arrays.copyOfRange()
         * -------------------------
         * Bir dizinin belirli bir aralığının kopyasını oluşturur.
         * İlk indeks DAHİL, ikinci indeks HARİÇ'tir. (fromInclusive, toExclusive)
         */
        System.out.println("7. Arrays.copyOfRange() -> Dizinin belirli bir bölümünü kopyalama");
        int[] kaynak = {10, 20, 30, 40, 50, 60};
        System.out.println("Kaynak dizi: " + Arrays.toString(kaynak));
        // 1. indeksten başla, 4. indekse kadar kopyala (4. indeks dahil değil). Yani 1, 2, ve 3. indeksler alınır.
        int[] aralikKopya = Arrays.copyOfRange(kaynak, 1, 4);
        System.out.println("1. ve 4. indeksler arası kopya: " + Arrays.toString(aralikKopya));
        System.out.println("----------------------------------------------------------------------");

        // ... Diğer metotlar için de benzer detaylı açıklamalar eklenebilir.
        // Aşağıda kalan metotların örnekleri bulunmakt

        System.out.println("8. Arrays.deepToString() -> İç içe (çok boyutlu) dizileri yazdırma");
        int[][] matris = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Matris: " + Arrays.deepToString(matris));
        System.out.println("----------------------------------------------------------------------");

        System.out.println("9. Arrays.deepEquals() -> İç içe dizilerin eşitliğini kontrol etme");
        int[][] matris1 = {{1, 2}, {3, 4}};
        int[][] matris2 = {{1, 2}, {3, 4}};
        System.out.println("matris1 ve matris2 eşit mi? -> " + Arrays.deepEquals(matris1, matris2));
        System.out.println("----------------------------------------------------------------------");

        System.out.println("10. Arrays.asList() -> Diziyi bir List'e çevirme");
        String[] isimler = {"Ali", "Veli", "Ayşe"};
        List<String> isimListesi = Arrays.asList(isimler);
        System.out.println("Oluşturulan Liste: " + isimListesi);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("11. Arrays.stream() -> Diziyi modern işlemler için bir 'Stream'e dönüştürme");
        int[] streamDizisi = {1, 2, 3, 4, 5, 6};
        System.out.println("Orijinal dizi: " + Arrays.toString(streamDizisi));
        System.out.print("Sadece çift sayıları 10 ile çarpıp yazdır: ");
        Arrays.stream(streamDizisi)
                .filter(sayi -> sayi % 2 == 0) // Sadece çift sayıları al
                .map(sayi -> sayi * 10)       // Her birini 10 ile çarp
                .forEach(sayi -> System.out.print(sayi + " ")); // Ekrana yazdır
        System.out.println("\n----------------------------------------------------------------------");

        System.out.println("12. Arrays.parallelSort() -> Büyük dizileri daha hızlı sıralama");
        int[] buyukDizi = {9, 4, 1, 8, 3, 7, 2, 6, 5, 0};
        Arrays.parallelSort(buyukDizi);
        System.out.println("Paralel sıralanmış dizi: " + Arrays.toString(buyukDizi));
        System.out.println("----------------------------------------------------------------------");

        System.out.println("13. Arrays.mismatch() -> İki dizideki ilk farklı elemanın indeksini bulma");
        int[] diziA = {1, 2, 3, 4};
        int[] diziB = {1, 2, 9, 4};
        System.out.println("diziA: " + Arrays.toString(diziA));
        System.out.println("diziB: " + Arrays.toString(diziB));
        int farkIndex = Arrays.mismatch(diziA, diziB); // İlk fark 2. indekste (3 ve 9)
        System.out.println("İlk farkın olduğu indeks: " + farkIndex);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("14. Arrays.compare() -> İki diziyi sözlük gibi karşılaştırma");
        int[] d1 = {1, 2, 3};
        int[] d2 = {1, 2, 4};
        // d1, d2'den "küçük" olduğu için negatif bir değer döner.
        int sonuc = Arrays.compare(d1, d2);
        System.out.println("Karşılaştırma sonucu (negatif ise d1 önce gelir): " + sonuc);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("15. Arrays.hashCode() -> Dizinin içeriğine göre bir kimlik numarası üretme");
        int[] veri = {10, 20, 30};
        System.out.println("Dizinin hash kodu: " + Arrays.hashCode(veri));
        System.out.println("----------------------------------------------------------------------");

        System.out.println("16. Arrays.setAll() -> Diziyi bir kurala göre doldurma");
        int[] yeniDizi = new int[5];
        // Dizinin her elemanını, o elemanın indeksinin karesi olarak ayarla.
        Arrays.setAll(yeniDizi, (int i) -> i * i);
        System.out.println("Oluşturulan yeni dizi (her eleman indeksinin karesi): " + Arrays.toString(yeniDizi));
        System.out.println("----------------------------------------------------------------------");

        System.out.println("--- Java Arrays Sınıfı Metotları (Detaylı Açıklamalarla) ---\n");

        // ====================================================================================
        // 1. setAll(dizi, kural): Diziyi, indekse (sıra numarasına) bağlı bir kurala göre doldurur.

        int[] diziX = new int[3];
        int[] diziZ = new int[3];
        int karsilastirmaXZ = Arrays.compare(diziX, diziZ);
        System.out.println("5. compare() (X ve Z farkı): " + karsilastirmaXZ);
        // 20 - 30 = -10 (Negatif çıkması, ilk dizinin ikinci diziden küçük olduğu anlamına gelir.)
        // Diziler tam olarak aynıysa (elemanlar ve uzunluk) 0 döner.
    }
}
