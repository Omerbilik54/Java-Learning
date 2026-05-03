package Ornek2;

public class Main {
    public static void main(String[] args) {

        // UPCASTING:
        // Referans tipi Calisan
        // Ama nesneler FARKLI SINIFLARDAN
        Calisan c1 = new NormalCalisan("Ahmet", 15000);
        Calisan c2 = new Mudur("Mehmet", 20000, 5000);
        Calisan c3 = new Stajyer("Ayşe", 10000);

        // Hepsi aynı tür gibi davranıyor
        // Ama içeride FARKLI metodlar çalışıyor
        c1.bilgiYazdir();
        System.out.println("------------");
        c2.bilgiYazdir();
        System.out.println("------------");
        c3.bilgiYazdir();
    }
}
//AKLINDA KALSIN DİYE TEK CÜMLE
//
//        Polimorfizm = Aynı isimli metod + farklı sınıflar + çalışma zamanında farklı davranış
