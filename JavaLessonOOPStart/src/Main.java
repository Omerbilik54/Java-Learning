//Object (Nesne)
//Bir class'ı (şemayı, planı) örneklersek o sınıfın instance'ını yani örneğini, objesini, nesnesini ne derseniz deyin oluşturmuş oluruz.
//Nesnelerin durumları vardır. Bir Kare class'ından oluşturulan objenin kenar uzunluğu durumu (state'i) vardır.
//Nesnelerin davranışları vardır. Aksiyon denebilir. Kare sınıfının alanının hesaplanması bir davranıştır.
//State'ler field'ları, davranışlar method'ları temsil eder.
public class Main {
    public static void main(String[] args) {
        Ev ev1 = new Ev();
        Ev ev2 = new Ev();
        ev2.camSekli = "Kare";
        ev2.evinYapilisYili = 2011;
        ev2.catiRengi = "Mavi";
        ev2.kapininRengi = "Kırmızı";
        System.out.println(ev2.kapininRengi);
        System.out.println(ev2.catiRengi);
        System.out.println(ev1.camSekli);
        System.out.println(ev2.camSekli);


        HesapMakinesi hm1 = new HesapMakinesi();
        hm1.topla(40,32);
        hm1.topla(23);
        System.out.println("hm1deki Değeri yazdır : " + hm1.hesapMakinesindekiDegeriDondur());

        HesapMakinesi hm2 = new HesapMakinesi();
        hm2.topla(5);
        hm2.topla(8);
        System.out.println("hm2 deki değeri yazdır : " + hm2.hesapMakinesindekiDegeriDondur());


    }
 }