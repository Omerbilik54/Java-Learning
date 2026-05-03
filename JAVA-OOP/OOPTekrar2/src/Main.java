public class Main {
    public static void main(String[] args) {
        //Kişi nesnesi:
        Kisi k1 = new Kisi("Ömer" , 20);
        k1.bilgiVer();
        System.out.println(k1.toString());
        System.out.println("------------------");
        //Öğretmen nesnesi:
        Ogretmen o1 = new Ogretmen("Elif" , 38,"Mesleki Ders" , 60000);
        o1.bilgiVer();
        System.out.println(o1.toString());
        System.out.println("------------------");
        //Öğrenci nesnesi:
        Ogrenci ogr1 = new Ogrenci("Onur" , 19, "Sakarya Mesleki Lisesi",85);
        ogr1.bilgiVer();
        System.out.println(ogr1.toString());
        System.out.println("------------------");
        System.out.println("PROGRAM BİTTİ!!!");
    }
}