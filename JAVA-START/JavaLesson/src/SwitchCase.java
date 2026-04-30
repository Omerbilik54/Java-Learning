import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner klavyedenVeriAl = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz : ");
        String isim1 = klavyedenVeriAl.nextLine();
        int sayi1 = klavyedenVeriAl.nextInt();
        int sayi2 = klavyedenVeriAl.nextInt();
        switch (sayi1)
        {
            case 40:// İnt yerine String ifadeleri switch case'e koyarsan tek farkı 100 yerine "Ömer" veya farklı bir string ifade yazman olacaktır .
                System.out.println("Evet  ilk girdiğiniz sayı 40");
                break;
            case 200:
                if (sayi2 > 100) {
                    System.out.println("Son girdiğimiz sayı 100'den büyük .");
                }
                System.out.println("İlk girdiğiniz sayı : " + sayi1);
                break;
            default:
                System.out.println("Hayır sayınız : " + sayi1);
        }
        //Veya hiç böyle karışık yapmana gerek yok . Artık yeni bir güncellemeyle daha basit yapabilirsin .
        //Yani bu -> işareti iki nokta yerine kullanabilirsin ve break yazmana gerek yok .
        switch (isim1) {
            case "Ömer" -> System.out.println("İsim Ömer");
            case "Yusuf" -> System.out.println("İsim Yusuf");
            default -> System.out.println("Sayıyı tutturamadınız");
        }
        System.out.println("Program Bitti. ");
    }
}
