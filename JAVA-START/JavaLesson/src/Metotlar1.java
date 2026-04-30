public class Metotlar1 {

    public static void main(String[] args) {
        // metot  = fonksiyon
        // Bir sınıfın davranışlarından bahsediyorsak aslında metotlar hakkında konuşuyoruz .
        selamla("Ömer");
        selamla("Yusuf");
        selamla("Murat");
//________________________________________________________________
        topla(10,20);
        topla(30,40);
//______________________________________________________________________
        int toplamDegeri = top(10 ,49 , "Ömer");
        System.out.println(toplamDegeri);
        //Burada top isimli  metotda bir kaydedilmiş bir işlem var . Biz bu metodu burada toplamDegeri ifadesine atayıp
        //Yazdırıyoruz .
//________________________________________________________________________
        int farkinDegeri = cıkar("Ömer" , 2,3,4,5,6,7,8,9,0);
        System.out.println(farkinDegeri);
//__________________________________________________________________________
    }
    static void selamla(String isim){
        // Metot gövdesi

        System.out.println("Merhaba " + isim);
    }

    static void topla(int sayi1 , double sayi2){
        System.out.println(sayi1 + sayi2);
    }

    static int top(int sayi1 , int sayi2 , String isim){
        System.out.println("Selamun Aleyküm " + isim );
        int toplam = sayi1 + sayi2 ;
        return toplam;
    }

    static int cıkar(String isim , int... sayilar){//Burada üç nokta koyduğun zaman istediğin kadar parametreyi (int sayilar) yukarıdaki paranteze ekleyeniliyorsun
        //Tek detay ise farklı bir parametre eklemek istediğin zaman üç noktayı eklediğin parametreden öncesine yerleştirmen gerekiyor.
        System.out.println("Merhaba " + isim);
        int eksi = 0;
        for(int sayi: sayilar){
            eksi-=sayi;
        }
        return eksi;
    }

}
