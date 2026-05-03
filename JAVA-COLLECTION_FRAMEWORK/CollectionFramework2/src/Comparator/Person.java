package Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name ;
        this.age = age;
    }

    public String getName(){
        return name;//Kişinin adını döndürür
    }
    public int getAge(){
        return age;//Kişinin yaşını döndürür
    }
    public String toString(){
        return name + " - " + age;
    }


}
