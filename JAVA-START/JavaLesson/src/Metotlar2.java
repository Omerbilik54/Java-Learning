import java.io.File;
import java.util.Arrays;

public class Metotlar2 {
    public static void main(String[] args) {
        //Recursive ya da recursion metotun kendisini tekrar çağırmasıdır .
        //Head Recursion = Başta çağırma , Body recursion = ortada çağırma , Tail recursion = kuyrukta çağırmasıdır.
        //Recursion dolaylı yoldan birden fazla fonksiyonun birbirini sırayla çağırmasında oluşabilir .
//________________________________________________________________________________-
        //Faktöriyel Hesapla (Recursivesiz)
        int n = 5;
        int toplam = 1;
        for (int i = 2; i <= n; i++) {
            toplam *= i;
        }
        System.out.println(toplam);
//_-_-________________________________________________________________________________-
        //Faktöriyel Hesaplama (Recursiveli)
        int recursiveToplam = faktöriyel(n);
        System.out.println(recursiveToplam);
        //selamla();
//-----------------------------------------------------------------------------------------
        klasorYazdır("C:/Users/bilik/OneDrive/Desktop/İngilizce");
//____________________________________________________________________________________
        System.out.println(topla(30, 40, 56, 786, 43, 56, 87, 54));

    }

    //Recursive ile yaptığımız faktöriyel hesaplama
    static int faktöriyel(int n) {
        if (n <= 1)
            return 1;

        return n * faktöriyel(n - 1);
    }

    static void klasorYazdır(String name) {
        File file = new File(name);
        File[] files = file.listFiles();
        for (File _file : files) {
            if (_file.isDirectory())
                klasorYazdır(_file.getAbsolutePath());
        }

    }

    //Burada soutun içine gireceğimiz değer sayısını sonsuz yapıyoruz .
    static int topla(int... sayilar) {
        int arti = 0;
        for (int sayi : sayilar) {
            arti += sayi;
        }
        return arti;
    }
//        1️⃣ file = new File(name)
//        Bu, verilen yolu temsil eden bir File nesnesi oluşturur.
//
//        2️⃣ files = file.listFiles()
//        Bu, o klasördeki tüm dosya ve klasörleri bir liste (dizi) olarak döndürür.
//
//        3️⃣ for (File _file : files)
//            Bu, listedeki her dosya veya klasörü teker teker inceler.
//
//        4️⃣ if (_file.isDirectory())
//            Bu satır, eğer bu nesne bir klasörse diyor.
//
//        5️⃣ klasorYazdır(_file.getAbsolutePath())
//        Eğer klasörse, aynı metodu o alt klasör için tekrar çağırıyor.
//                Bu sayede ağaç yapısında tüm klasörleri geziyor.


    //Burada bir döngü var.
//
//    static void selamla() {
//        System.out.println("Selam!");
//        selamla();
//    }
//
//    static void selamla2() {
//        System.out.println("Selam!");
//        selamla3();
//    }
//
//    static void selamla3() {
//        System.out.println("Selam!");
//        selamla4();
//    }
//
//    static void selamla4() {
//        System.out.println("Selam!");
//        selamla2();
//    }


}




