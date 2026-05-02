public class Main {
    public static void main(String[] args) {
        Araba a = new Araba();  // Erişilebildi çünkü Araba public
        a.calistir();           // Bu da public olduğu için kullanılabilir
//----------------------------------------------------------------------------
        Araba2 b = new Araba2();
        // a.hiz = 200; ❌ Erişilemez
        // a.motorCalis(); ❌ Erişilemez
        b.calistir();  // ✅ Public olduğu için erişilebilir
//----------------------------------------------------------------------------
        Faktoriyel f = new Faktoriyel();  // ✅ Aynı pakette olduğu için erişilebilir
        System.out.println(f.hesapla(5));
//-----------------------------------------------------------------------------------
        Kopek k = new Kopek();
        k.havla(); // ✅ Erişilebilir
        // k.sesCikar(); ❌ Erişilemez çünkü bu sınıf miras almıyor

    }
}





