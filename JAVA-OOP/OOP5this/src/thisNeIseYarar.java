public class thisNeIseYarar {
//  1. Aynı isimli değişkeni karıştırmamak için
//    public class Ogrenci {
//        private String isim;
//
//        public void setIsim(String isim) {
//            this.isim = isim; // soldaki 'this.isim' sınıfın değişkeni, sağdaki parametre
//        }
//    }
//  2. Aynı sınıf içindeki başka metodu çağırmak için
//    public void kaydet() {
//        System.out.println("Kayıt edildi.");
//    }
//
//    public void islemler() {
//        this.kaydet(); // aynı sınıftaki kaydet metodunu çağırıyor
//    }
//  3. Constructor (yapıcı metot) zinciri kurmak için
//    public class Ogrenci {
//        private String isim;
//        private int yas;
//
//        public Ogrenci() {
//            this("Bilinmiyor", 0); // diğer constructor'ı çağırıyor
//        }
//
//        public Ogrenci(String isim, int yas) {
//            this.isim = isim;
//            this.yas = yas;
//        }
//    }
}
