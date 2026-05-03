import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons= new ArrayList<>();

        persons.add(new Person("Ömer",20));
        persons.add(new Person("Onur",19));

        Collections.sort(persons);
        for(Person p : persons){
            System.out.println(p.getName() + " - " + p.getAge() );
        }
    }
}
//Comparable yoksa sıralama yok
//
//compareTo yanlışsa sonuç saçma
//
//Bir sınıfın doğal sırası Comparable ile tanımlanır