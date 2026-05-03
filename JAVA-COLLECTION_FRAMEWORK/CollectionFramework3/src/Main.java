import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // String türünde elemanlar tutacak bir ArrayList oluşturulur
        ArrayList<String> isimler = new ArrayList<>();

        // Listeye elemanlar eklenir
        isimler.add("Ömer");
        isimler.add("Onur");
        isimler.add("Ali");
        isimler.add("Ahmet");

        // Liste üzerinden bir Iterator alınır
        // iterator() metodu Iterable interface'inden gelir
        Iterator<String> iterator = isimler.iterator();

        // Iterator üzerinde dolaşma başlar
        while (iterator.hasNext()) {
            // hasNext():
            // Sırada okunacak eleman var mı kontrol eder

            String isim = iterator.next();
            // next():
            // Sıradaki elemanı getirir
            // Aynı zamanda iterator bir adım ilerler

            // Eğer isim "Kemal" ise
            if (isim.equals("Ali")) {
                iterator.remove();
                // remove():
                // En son next() ile getirilen elemanı
                // listeden GÜVENLİ bir şekilde siler
            }
        }

        // Silme işleminden sonra listenin son hali yazdırılır
        System.out.println(isimler);
    }
}
