public class Person implements Comparable<Person>{

    private String name ;
    private int age ;

    public Person(String name , int age){
        this.name = name ;
        this.age = age ;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override//Yaşa göre sıralama
    public int compareTo(Person other){
        return this.age - other.age;////Küçük yaş önce gelir
    }//this.age = mevcut nesne other.age = karşılaştırılan nesne

//    @Override
//    public int compareTo(Person other){
//        return this.name.compareTo(other.name);
//    }//Bu da yaş değil isme göre sıralama . Ve alfabeye göre yapıyor .

//    @Override//Bu da ters sıralama
//    public int compareTo(Person other) {
//        return other.age - this.age;
//    }

}

