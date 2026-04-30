import java.util.Scanner;

public class ForDongusu {
    public static void main(String[] args) {
        /*for (int i = 0, j = 10 , k = 30; i < 5 && j < 20; i++ , j += 5) {
            System.out.println(i + " " + j + " " + k );
            // || = "Veya demek" kontrol ifadesinde en az 1 true ifade varsa diğerleri yanlış bile olsa true gibi davranır .
            // && = "Ve demek" kontrol ifadesinde en az 1 false ifade varsa diğerleri doğru bile olsa false gibi davranır.




        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        if (sayi>0 && sayi<100);{
            System.out.println("Merhaba");
        }


        int i = 0;
        while (i<=sayi){
            System.out.print(i+"");
            i++;
        }









    }
}
