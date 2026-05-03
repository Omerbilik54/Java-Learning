package Comparator;

import java.util.Comparator;

public class YasComparator implements Comparator<Person> {
    //Person nesnelerini yaşa göre karşılaştıran sınıf
    @Override
    public int compare(Person p1,Person p2){
        //p1 = karşılaştırılan ilk sınıf
        //p2 = karşılaştırılan ikinci sınıf

        //p1'int yaşını alır
        int age1= p1.getAge();
        //p2'nin yaşını alır
        int age2= p2.getAge();

        //Yaşları karşılaştırır
        // age1 < age2  -> negatif (p1 önce gelir)
        // age1 == age2 -> 0 (eşit)
        // age1 > age2  -> pozitif (p2 önce gelir)
        return Integer.compare(age1,age2);
    }


}