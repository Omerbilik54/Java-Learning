//Üniversite Öğrenci Yönetim Sistemi
//
//Set ile tekrar engelleme
//
//equals ile öğrenci tanımı
//
//Comparable ile GPA sıralaması
//
//Comparator ile isim sıralaması
//
//Iterable ile grup gezme
//
//Iterator ile başarısızları silme
//
//Collections.sort ile sıralama

import java.util.*;
// java.util paketi içinden:
// Set, HashSet, List, ArrayList, Iterator, Comparator, Collections kullanıyoruz

// Öğrenci sınıfı
// Comparable<Student> implement edildiği için bu sınıfın
// "doğal bir sıralama kuralı" olacak
class Student implements Comparable<Student> {

    int id;        // Öğrencinin benzersiz kimlik numarası
    String name;   // Öğrencinin adı
    double gpa;    // Öğrencinin not ortalaması

    // Constructor: Student nesnesi oluşturulurken çalışır
    Student(int id, String name, double gpa) {
        this.id = id;       // Parametreden gelen id atanır
        this.name = name;   // Parametreden gelen name atanır
        this.gpa = gpa;     // Parametreden gelen gpa atanır
    }

    // equals metodu override ediliyor
    // Amaç: iki Student nesnesinin mantıksal olarak eşit olup olmadığını belirlemek
    @Override
    public boolean equals(Object o) {

        // Eğer iki referans aynı nesneyi gösteriyorsa direkt true
        if (this == o) return true;

        // Eğer karşılaştırılan nesne null ise
        // ya da sınıflar farklıysa eşit değildir
        if (o == null || getClass() != o.getClass()) return false;

        // Object tipindeki o'yu Student tipine çeviriyoruz
        Student s = (Student) o;

        // Aynı id'ye sahip iki öğrenci
        // aynı öğrenci kabul edilir
        return this.id == s.id;
    }

    // Comparable interface’inden gelen metod
    // Öğrencilerin nasıl sıralanacağını tanımlar
    @Override
    public int compareTo(Student o) {

        // GPA’ya göre büyükten küçüğe sıralama
        // o.gpa > this.gpa ise negatif döner → o önce gelir
        return Double.compare(o.gpa, this.gpa);
    }

    // Öğrenci bilgilerini ekrana yazdıran yardımcı metod
    void print() {
        System.out.println(id + " " + name + " " + gpa);
    }
}

// Comparator implementasyonu
// Öğrencileri isme göre sıralamak için kullanılır
class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {

        // String.compareTo:
        // alfabetik (A-Z) sıralama yapar
        return a.name.compareTo(b.name);
    }
}

// Öğrenci grubu sınıfı
// Iterable<Student> implement edildiği için
// bu sınıf foreach içinde gezilebilir
class StudentGroup implements Iterable<Student> {

    // Öğrenciler Set içinde tutuluyor
    // Set tekrar eden eleman kabul etmez
    Set<Student> students = new HashSet<>();

    // Öğrenci ekleme metodu
    void addStudent(Student s) {
        // equals() true dönerse Set eklemez
        students.add(s);
    }

    // Iterable interface’inden gelen metod
    // foreach bu metoda bakar
    @Override
    public Iterator<Student> iterator() {

        // Set’in iterator’unu dışarı döndürüyoruz
        return students.iterator();
    }
}

public class Main {
    public static void main(String[] args) {

        // Öğrenci grubu oluşturuluyor
        StudentGroup group = new StudentGroup();

        // Öğrenciler gruba ekleniyor
        group.addStudent(new Student(1, "Ali", 3.2));
        group.addStudent(new Student(2, "Ayşe", 1.8));
        group.addStudent(new Student(3, "Mehmet", 2.9));
        group.addStudent(new Student(1, "Ali", 3.2));
        // Aynı id olduğu için equals() true döner
        // Set bu öğrenciyi ikinci kez eklemez

        // Iterator alıyoruz
        // Amaç: başarısız öğrencileri (gpa < 2.0) silmek
        Iterator<Student> it = group.iterator();

        while (it.hasNext()) {

            // Sıradaki öğrenci alınıyor
            Student current = it.next();

            // GPA 2.0’dan küçükse
            if (current.gpa < 2.0) {

                // Iterator üzerinden güvenli silme
                // foreach içinde remove yapsaydık hata olurdu
                it.remove();
            }
        }

        // Set sıralanamaz
        // Bu yüzden Set’i List’e çeviriyoruz
        List<Student> list = new ArrayList<>();

        // Iterable olduğu için StudentGroup foreach ile gezilebiliyor
        for (Student s : group) {
            list.add(s);
        }

        // Collections.sort(list)
        // → Comparable kullanır
        // → Student.compareTo() çağrılır
        // → GPA’ya göre sıralama yapılır
        Collections.sort(list);

        System.out.println("GPA sıralı:");
        for (Student s : list) {
            s.print();
        }

        // Collections.sort(list, comparator)
        // → Comparator kullanır
        // → SortByName.compare() çağrılır
        // → İsme göre sıralama yapılır
        Collections.sort(list, new SortByName());

        System.out.println("İsme göre sıralı:");
        for (Student s : list) {
            s.print();
        }
    }
}
