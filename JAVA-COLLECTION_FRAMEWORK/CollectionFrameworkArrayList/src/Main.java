import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList oluşturuluyor
        ArrayList<Integer> numbers = new ArrayList<>();

        // Eleman ekleme
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Index ile erişim (çok hızlı)
        System.out.println(numbers.get(0)); // 10

        // Araya eleman ekleme
        numbers.add(1, 99);
        // 1. indexe 99 koyar, diğerlerini kaydırır

        // Eleman silme
        numbers.remove(2);
        // index 2'deki elemanı siler

        // Tüm elemanları yazdırma
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
