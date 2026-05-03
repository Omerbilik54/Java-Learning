package Comparable;

import java.util.Iterator;
import java.util.List;
//Iterable – “BEN GEZİLEBİLİRİM”
//Iterable = foreach çalışsın diye
class StudentGroup implements Iterable<Student> {

    List<Student> list;

    StudentGroup(List<Student> list) {
        this.list = list;
    }

    @Override
    public Iterator<Student> iterator() {
        // Liste iterator’unu döndürüyoruz
        return list.iterator();
    }
}
//Iterator – KONTROLLÜ GEZME
//Iterator = “Silerek, kontrollü dolaş”

//        Iterator<Student> it = students.iterator();
//
//while (it.hasNext()) {
//        Student s = it.next();
//
//    if (s.gpa < 2.0) {
//        it.remove(); // Güvenli silme
//    }
//            }

//
//Collections.sort()
//
//        Collections = yardımcı sınıf
//        sort = sıralama motoru
//Collections.sort(list); // Comparable kullanır
//Collections.sort(list, new SortByName()); // Comparator kullanır


