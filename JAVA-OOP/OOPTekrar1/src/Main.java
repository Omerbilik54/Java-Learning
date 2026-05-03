public class Main {
    public static void main(String[] args) {
        System.out.println("Program başladı");

        Meyve m = new Meyve("Meyve","yeşil");

        Elma e = new Elma("Elma" , "Yeşil" , "Golden" );

        Limon l=new Limon("Limon" , "Sarı" , 7);

        m.tatVer();
        e.tatVer();
        l.tatVer();

        System.out.println("Pogram Bitti ");

    }
}
