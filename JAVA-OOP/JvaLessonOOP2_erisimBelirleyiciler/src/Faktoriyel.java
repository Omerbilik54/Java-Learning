//🏡 3️⃣ Default (Hiçbir şey yazılmaz) → “Sadece aynı paketten erişilir”
//
//Eğer hiçbir erişim belirleyici yazmazsan default olur.
//
//Yani aynı klasör (package) içindeki class’lar erişebilir.
//
//Farklı paket (klasör) içindekiler erişemez.
//
//📍 Kullanım yeri: Class, metot veya değişken.
class Faktoriyel {   // 'public' yazmadık = default oldu
    int hesapla(int n) {
        if (n <= 1) return 1;
        return n * hesapla(n - 1);
    }
}
