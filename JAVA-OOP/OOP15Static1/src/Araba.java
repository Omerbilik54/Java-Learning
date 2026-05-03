public class Araba {
    private int yas;
    private static int syas;


    public Araba(){
        //Sayac.staticSayac++;
        System.out.println("Araba Constructer");
    }


    public static int yil = 2023;

    static {
        System.out.println("Static instance init Araba");
    }

    {
        System.out.println("Instance init Araba");
    }



    public static void tekerlekleriDegistir(){
        System.out.println("Tekerlekleri Değiştirin");
    }

    public void selektorYap(){
        System.out.println("Biiip");
    }




}
