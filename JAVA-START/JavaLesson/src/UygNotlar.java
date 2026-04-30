import java.util.Scanner;

public class UygNotlar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç öğrencinin notunu gireceksiniz ? ");
        int ogrenciSayi = scanner.nextInt();
        int[] diziOgrenci = new int[ogrenciSayi];

        for (int i = 0 ; i < ogrenciSayi ; i++){
            System.out.println((i + 1) + ". Öğrencinin notu : ");
            int not = scanner.nextInt();
            diziOgrenci[i] = not ;
        }

        double ortalama = 0;
        for (int i = 0; i < ogrenciSayi ; i++) ortalama +=  diziOgrenci[i]/ogrenciSayi;

        System.out.println("Ortalama : " + ortalama);






    }
}
