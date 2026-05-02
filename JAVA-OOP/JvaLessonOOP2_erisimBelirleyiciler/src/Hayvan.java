//🧬 4️⃣ Protected → “Aynı paket + kalıtım (inheritance) varsa farklı paket de görebilir”
//
//Default gibi çalışır ama ek olarak alt sınıflar (subclass) erişebilir.
//
//Yani miras alınan (extends) bir class’tan erişim mümkündür.
//
//📍 Kullanım yeri: Genellikle superclass → subclass ilişkilerinde.

public class Hayvan {
    protected void sesCikar() {
        System.out.println("Bir hayvan ses çıkardı.");
    }
}
