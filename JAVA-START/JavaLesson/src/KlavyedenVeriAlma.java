import java.util.Scanner;

public class KlavyedenVeriAlma {
    public static void main(String[] args) {
        //Java’da kullanıcıdan klavyeden veri almak için Scanner sınıfı kullanılır.
        //Bir Scanner nesnesi oluştururken, System.in parametresi verilir. Bu da klavyeden girilen veriyi temsil eder.

        Scanner klavyedenVeriAl = new Scanner(System.in);
        //Böylece klavyedenVeriAl adında bir okuyucu (scanner) oluşturmuş oluyorsun.
        System.out.println("İsminizi Giriniz :");

        String isim = klavyedenVeriAl.nextLine();
        //nextLine() → Klavyeden girilen tüm satırı (boşluk dahil) okur.
        //Örneğin kullanıcı "Ali Veli" yazarsa, isim değişkeninde "Ali Veli" saklanır.
        System.out.println("Yaşınızı Giriniz : ");
        int yas = klavyedenVeriAl.nextInt();
        //nextInt() → Kullanıcının klavyeden girdiği ilk tam sayıyı okur.
        //⚠️ Burada dikkat etmen gereken nokta: nextInt() sadece sayıyı okur, enter (yeni satır karakteri) klavyede kalır.
        // Bu yüzden bazen nextLine() ile karışıklık çıkabilir. Senin kodunda bu sorun yok çünkü nextLine() en başta çağrılmış.
        // Eğer önce nextInt() sonra nextLine() olsaydı nextLine() değer olarak boşluk değerini alırdı .
        // Bu sebeple önce nextInt() gelirse hemen ardında boş bir nextLine() koy ki nextInt ile oluşan boşluk değerini silsin .
        //boş bir nextLine() değeri = klavyedenVeriAl.nextLine();
        System.out.println("Yazdığınız Yaş : " + yas);
        System.out.println("Yazdığınız isim : " + isim);

        System.out.print("Sayıyı Giriniz : ");
        int sayi1 = klavyedenVeriAl.nextInt();

        System.out.println("Girdiğiniz Sayı : " + sayi1);

    }

}


