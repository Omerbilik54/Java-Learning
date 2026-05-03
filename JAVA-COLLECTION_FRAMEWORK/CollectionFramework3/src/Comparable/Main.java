package Comparable;

import java.util.Set;
import java.util.HashSet;
//Set = “Aynı elemanı bir daha koyarsan seni ciddiye almam”
public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "Ali"));
        students.add(new Student(1, "Ali")); // equals true -> eklenmez
        students.add(new Student(2, "Ayşe"));

        System.out.println(students.size()); // 2
    }
}

