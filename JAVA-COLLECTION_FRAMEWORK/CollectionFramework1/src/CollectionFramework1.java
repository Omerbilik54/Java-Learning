import java.util.ArrayList;
import java.util.List;

public class CollectionFramework1 {
    public static void main(String[] args) {
        //Arraylist sık kullandığımız metotlar .

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10;i++){
            list.add(i*i);
        }
        System.out.println(list);
//--------------------------------------------------------

        ArrayList<String> liste = new ArrayList<>();
//Sol taraf neler yapabileceğini sağ taraf ise yeteneklerini nerede kullanacağını belirtir.
        liste.add("Elma");
// Listeye eleman ekler (sona ekler)

        liste.add(1, "Armut");
// Belirtilen index'e eleman ekler, aradakileri kaydırır

        String eleman = liste.get(0);
// Verilen index'teki elemanı getirir

        int elemanSayisi = liste.size();
// Listede kaç eleman olduğunu döndürür

        liste.remove(0);
// Verilen index'teki elemanı siler

        liste.remove("Elma");
// Verilen değeri bulur ve listeden siler

        liste.set(0, "Muz");
// Verilen index'teki elemanın değerini değiştirir

        boolean varMi = liste.contains("Muz");
// Listede verilen eleman var mı yok mu kontrol eder

        boolean bosMu = liste.isEmpty();
// Liste boş mu diye kontrol eder

        liste.clear();
// Listedeki tüm elemanları siler, listeyi boşaltır

        int index = liste.indexOf("Armut");
// Elemanın index'ini döndürür, yoksa -1 döner

        liste.forEach(e -> System.out.println(e));
// Listedeki tüm elemanları tek tek dolaşır ve işlem yapar

        String[] dizi = liste.toArray(new String[0]);
// ArrayList'i normal diziye çevirir

        for (Integer integer : list) {
            System.out.println(integer);
        }
//Burada da for ile bütün listeyi yazdırabiliyoruz .


//---------------------------------------------------------------

//Biz şimdi burada bir classı saklayabiliyoruz.

// Person tipinde nesneler tutacak bir ArrayList oluşturulur
        List<Person> personList = new ArrayList<>();

// Bellekte (heap) yeni bir Person nesnesi oluşturulur
// Bu nesnenin adı "Ömer" olarak atanır
        Person p = new Person("Ömer");

// Bellekte yeni bir Person nesnesi oluşturulur ("Onur")
// Bu nesnenin referansı tutulmaz, direkt listeye eklenir
        personList.add(new Person("Onur"));
        personList.add(p);

// Daha önce oluşturulan p referanslı Person nesnesi
// listeye eklenir (yeni nesne oluşturulmaz)
        personList.add(p);

// Listede 0. index'teki Person nesnesi alınır
// Bu nesne Onur isimli kişiyi temsil eder
        Person p1 = personList.get(0);

// p1 referansının gösterdiği Person nesnesinin
// name alanı getName() metodu ile okunur ve ekrana yazdırılır
        System.out.println(p1.getName());





    }
}
