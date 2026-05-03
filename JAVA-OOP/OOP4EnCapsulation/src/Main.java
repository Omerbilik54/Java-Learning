public class Main{
    public static void main(String[] args) {
        Araba a1 = new Araba();
        a1.arabaSur(10);
        a1.arabaSur(20);
        a1.arabaSur(50);
        a1.arabaSur(80);
        a1.arabaSur(150);
//Alttaki ile üstteki yapı aynı işe yarıyor . Ama üstteki saha basit ve anlaşılır .
        ArabayıSurmeManager arabayıSurmeManager = new ArabayıSurmeManager();
        arabayıSurmeManager.arabayıSur(a1);

    }
}
//Encapsulation, yani “kapsülleme”, bir sınıfın verilerini (değişkenlerini) dışarıdan doğrudan erişime kapatıp,
// kontrollü bir şekilde sadece metotlar aracılığıyla erişilmesini sağlamaktır.
//Amaç: Veriyi korumak, gereksiz veya yanlış erişimi engellemek.