package Ornek1;

public class Main {
    public static void main(String[] args) {
        Personal p = new Personal();
        p.maasAl();
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