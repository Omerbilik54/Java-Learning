import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Hayvan h = new Kedi();
//        Kedi k = (Kedi) h;
//        k.miyav();
//        //Bu downCasting
//
//        long faktoriyel = 1;
//        BigInteger bigInteger = new BigInteger("2");
//        System.out.println(bigInteger.multiply(new BigInteger("25")));
//        for(int i =20; i>=2 ; i--){
//            faktoriyel*=i;
//        }//  .multiply BigInteger değerlerde çarpma işlemi yapmak için kullanılır

        // Generic kullanmadan oluşturulmuş bir sınıfın nesnesi.
        // İçinde Object türünde veri tutar.
        KutuGenericSınıf k = new KutuGenericSınıf();
        // Object kabul ettiği için her türlü veri atanabilir.
        k.set("Selam");
        // get() metodu Object döndürür.
        // Bu yüzden String'e cast (dönüştürme) yapmak zorundayız.
        String s = (String) k.get();


        // Generic kullanılarak oluşturulmuş sınıf.
        // <String> dediğimiz için artık bu sınıf sadece String ile çalışır.
        KutucukGenericSınıf<String> k1 = new KutucukGenericSınıf<>();
        // SADECE String kabul eder, başka tür koyamazsın.
        // Tip güvenliği sağlar.
        k1.set1("Selam");
        // get1() metodu artık direkt String döndürür.
        // Cast yapmaya gerek yok.
        String s1 = k1.get1();


        // Generic metot örnekleri.
        // Metot çağrılırken gönderilen parametreye göre tipi otomatik belirlenir.
        YazdiriciGenericMethod.yazdir("Merhaba"); // String
        YazdiriciGenericMethod.yazdir(42);        // Integer
        YazdiriciGenericMethod.yazdir(3.14);      // Double


        // Generic sınır (bounded type) kullanımı.
        // <Integer> Number sınıfından türediği için geçerli.
        HesapGenericSınır<Integer> h1 = new HesapGenericSınır<>(10);
        // Double da Number'dan türediği için geçerli.
        HesapGenericSınır<Double> h2 = new HesapGenericSınır<>(3.14);


        // String listesi oluşturduk.
        List<String> isimler = Arrays.asList("Ömer", "Onur");
        // Integer listesi oluşturduk.
        List<Integer> sayilar = Arrays.asList(2, 3, 4, 5, 6, 67, 7, 5, 4345);
        // Wildcard (?)
        // Bu metot List<?> kabul ettiği için her türden liste alabilir.
        YazdirGenericWildcard.yazdir1(isimler);
        YazdirGenericWildcard.yazdir1(sayilar);


        // Büyük örnek: Generic depo sınıfı.
        // String tipinde ürün tutan depo.
        DepoGenericBuyukOrnek<String> stringDepoGenericBuyukOrnek =
                new DepoGenericBuyukOrnek<>("Elma");
        // Depodan alınan ürün String olarak gelir.
        String urun1 = stringDepoGenericBuyukOrnek.getUrun();
        System.out.println(urun1);


        // Aynı depo sınıfı bu sefer Integer ile kullanılıyor.
        DepoGenericBuyukOrnek<Integer> intDepoGenericBuyukOrnek =
                new DepoGenericBuyukOrnek<>(100);
        // Depodan alınan ürün Integer olarak gelir.
        int urun2 = intDepoGenericBuyukOrnek.getUrun();
        System.out.println(urun2);





    }
}
