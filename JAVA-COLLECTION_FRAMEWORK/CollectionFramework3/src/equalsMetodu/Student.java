package equalsMetodu;
//equals = “Bu iki nesne mantıksal olarak aynı mı?”
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // Aynı referans mı?
        if (this == o) return true;

        // Null mu veya farklı sınıf mı?
        if (o == null || getClass() != o.getClass()) return false;

        // Object’i Student’a çeviriyoruz
        Student student = (Student) o;

        // Mantıksal eşitlik kuralı
        return this.id == student.id;
    }
}
