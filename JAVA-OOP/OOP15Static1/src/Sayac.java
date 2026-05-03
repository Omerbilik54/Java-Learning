public class Sayac {

    public int sayac;

    public static int staticSayac;

    public void sayacArttir(){
        sayac++;
    }
    //Statik olmayan yapılardan statik yapıları çağırabiliriz .
    public void staticSayacArttir(){
        staticSayac++;
    }
    //Statik yapılardan statik olmayan yapıları çağıramayız .
    public static void staticSayacYazdir(){
        System.out.println(staticSayac);

    }


}
