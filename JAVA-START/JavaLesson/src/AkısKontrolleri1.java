import java.util.Scanner;

public class AkısKontrolleri1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int sayi= scanner.nextInt();
        int tersSayi = 0;
        while(sayi>0){
            int sonRakam = sayi%10;
            tersSayi = (tersSayi * 10) + sonRakam;
            sayi/= 10;
        }
        System.out.println(tersSayi);

    }

}
