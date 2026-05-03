import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // List interface tipinde bir referans oluşturuyoruz
        // Sağ taraf ArrayList olabilir, LinkedList olabilir
        // Bu OOP açısından esneklik sağlar (polimorfizm)
        List<String> students = new ArrayList<>();

        // Listeye eleman ekleme
        students.add("Ahmet");   // index 0
        students.add("Mehmet");  // index 1
        students.add("Ahmet");   // index 2 -> aynı eleman olabilir

        // Index ile elemana erişme
        System.out.println(students.get(1)); // Mehmet

        // Listedeki eleman sayısını alma
        System.out.println(students.size()); // 3

        // Belirli bir elemanı silme
        students.remove("Ahmet");
        // Sadece İLK bulduğu Ahmet’i siler

        // Döngü ile gezme
        for (String s : students) {
            System.out.println(s);
        }
    }
}
