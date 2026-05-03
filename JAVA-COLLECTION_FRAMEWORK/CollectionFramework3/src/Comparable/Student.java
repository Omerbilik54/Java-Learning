package Comparable;

class Student implements Comparable<Student> {
    int id;
    String name;
    double gpa;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
    Student(int id,String name, int gpa){
        this.id = id;
        this.name = name;
        this.gpa=gpa;
    }

    @Override
    public int compareTo(Student other) {
        // GPA’ya göre sıralama
        // this < other  -> negatif
        // this == other -> 0
        // this > other  -> pozitif
        return Double.compare(this.gpa, other.gpa);
    }
}

