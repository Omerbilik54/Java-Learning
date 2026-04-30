public class Donusumler {
    public static void main(String[] args){
        // Bilinçi dönüşüm küçükten büyüğe geçerken yapılır .
        //        byte
        //        short
        //        integer
        //        long
        //        float
        //        double
        byte byteSayi = 100;
        short shortSayi= byteSayi;

        short shortSayi1 = 10_000;
        int intSayi= shortSayi1;
        System.out.println(intSayi);

        //Ama büyükten küçüğe geçerken kurallar var .
        double doubleSayi = 42.0d;
        float floatSayi= (float) doubleSayi;
        long longSayi = (long) floatSayi;
        int intSayi1 = (int) longSayi;
        short shortSayi2 = (short) intSayi1;
        byte byteSayi1 = (byte) shortSayi2;
        System.out.println(byteSayi1);
        int deger = 1_000;
        short Value =(short) deger ;
        char a = (char) Value;
        System.out.println(a);
        //Virgüllü kısımları sadece double ve float saklar . float deger = 38f diye yazılır .


        //Cümle içinde tırnak işareti kullanmak için güzel . Bu tek tırnakta da geçerli . \n işareti neyin önündeyse onu bi alt satıra indiriyor .
        String isim = "Merhaba \n\"Ömer\" \nbugün günlerden Cuma " ;
        System.out.println(isim);








    }
}
