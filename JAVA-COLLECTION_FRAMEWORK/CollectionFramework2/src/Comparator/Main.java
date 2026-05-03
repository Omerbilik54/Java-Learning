package Comparator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Person nesnelerini ttutacak liste
        List<Person> persons = new ArrayList<>();

        //Listeye Person eklenir
        persons.add(new Person("Ömer" , 21));
        persons.add(new Person("Onur" , 20));

        //Yaşa göre sıralama yapan Comparator nesnesi oluşturulur .
        YasComparator yas_Comparator = new YasComparator();
        //Liste,yaz_Comparator kuralına göre sıralanır
        Collections.sort(persons , yas_Comparator);
        //Sıralanmış liste ekrana yazdırılır
        //Her elemna için toString() çağrılır
        System.out.println(persons);
    }
}
