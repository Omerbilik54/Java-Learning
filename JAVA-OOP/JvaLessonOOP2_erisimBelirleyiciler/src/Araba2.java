public class Araba2 {
    private int hiz = 150;   // Başka class’tan göremezsin

    private void motorCalis() {   // Sadece bu class içinde çağrılabilir
        System.out.println("Motor çalışıyor...");
    }

    public void calistir() {
        motorCalis();  // Private olduğu halde burada kullanılabilir
        System.out.println("Araba çalıştı.");
    }
}
//🔒 2️⃣ Private → “Sadece kendi class’ı görebilir”
//
//Başka class’tan görülemez.
//
//En kısıtlı erişim düzeyidir.
//
//Genellikle veri gizleme (encapsulation) için kullanılır.
//
//📍 Kullanım yeri: Değişken veya metot (class dışına kapalı olur)

