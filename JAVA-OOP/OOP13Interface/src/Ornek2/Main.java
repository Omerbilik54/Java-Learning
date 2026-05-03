package Ornek2;

public class Main {
    public static void main(String[] args) {
        Dil dil = new Ingilizce();
        Dil dil1 = new Turkce();
        Dil dil2 = new Java();
        ;
        dil.selamla();
        dil1.selamla();
        dil2.selamla();

        Java java = new Java();
        java.yazdir();
        dil2.yazdir();
    }
}
//Önemli Kurallar:
//Java'da bir sınıf yalnızca BİR sınıfı extend edebilir (çoklu kalıtım yok)
//
//Bir sınıf birden fazla interface'i implement edebilir
//
//Interface'ler birden fazla interface'i extend edebilir
//
//Final sınıflar extend edilemez (örn: String, Integer gibi wrapper sınıflar)
//
//Private ve default (package-private) sınıflar başka paketten extend edilemez
