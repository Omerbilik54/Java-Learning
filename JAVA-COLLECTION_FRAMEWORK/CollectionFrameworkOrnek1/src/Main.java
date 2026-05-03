import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Student1 {
    String name;
    int number;

    // Constructor
    public Student1(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Bilgi yazdırma metodu
    public void printInfo() {
        System.out.println(name + " - " + number);
    }
}

public class Main {

    public static void main(String[] args) {

        // List interface kullanıyoruz
        // Alt yapı ister ArrayList ister LinkedList olabilir
        List<Student1> students = new ArrayList<>();
        // List<Student> students = new LinkedList<>(); // Değiştirsen bile kod çalışır

        // Öğrenciler ekleniyor
        students.add(new Student1("Ali", 101));
        students.add(new Student1("Ayşe", 102));
        students.add(new Student1("Mehmet", 103));

        // Index ile erişim
        students.get(1).printInfo(); // Ayşe - 102

        // Döngü ile tüm öğrencileri yazdırma
        for (Student1 s : students) {
            s.printInfo();
        }

        // Öğrenci silme
        students.remove(0); // Ali silinir

        System.out.println("Silme sonrası:");

        for (Student1 s : students) {
            s.printInfo();
        }
    }
}
