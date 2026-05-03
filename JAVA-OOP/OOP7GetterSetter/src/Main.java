public class Main {
    public static void main(String[] args) {
//Getter: Bir değişkenin değerini okumak (getirmek) için kullanılır.
//
//Setter: Bir değişkenin değerini değiştirmek (ayarlamak) için kullanılır.
//Setteri sout içinde kullanamazsın . Zaten setterin amacı parametreyi başka bir classtan değiştirmektir .

        Personal p1 = new Personal("Ömer" , "Mühendis" , 20);
        Personal p2 = new Personal("Onur" , "Elektrikçi" , 19);
        p1.getYas();
        p1.setyas(20);
        p1.setcalistigiBolum("Başmühendis");
        p1.setisim("Muhammed");
        System.out.println(p1.getisim());
        System.out.println(p1.getYas());

        p2.setyas(21);
        p2.setisim("Muhammed");
        p2.setcalistigiBolum("Yazılım");
        System.out.println(p1.getYas());
        p1.yazdir();
    }
}
