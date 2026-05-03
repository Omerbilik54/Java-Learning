public class Main{
    public static void main(String[] args) {
        Kisi k = new Kisi("Ömer", 20);

        //k nesnesi asla değişmez
        Kisi k2 = k.yasArtir();

        System.out.println(k.getYas());
        System.out.println(k2.getYas());
        //Sanki orijinal tabloyu cam vitrine koyup, dokunmak yasak gibi. Yenisini yapmak serbest.

    }
}
