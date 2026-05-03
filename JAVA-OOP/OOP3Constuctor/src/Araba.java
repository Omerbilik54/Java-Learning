public class Araba {
    public String model;
    public int uretimYılı ;
//
//    public Araba(){
//        System.out.println("Nesne Üretiliyor.");
//Buna constructor denir . Otomatik olaarak çağrılır . Bu parametresiz constructor .

    public Araba(String modela , int uretimYılı){
        System.out.println("Nesne Üretiliyor !");
        model = modela;
    }
    public void arabayıYazdir() {
    System.out.println("Araba Modeli : " + model);
    System.out.println("Üretim Yılı : " + uretimYılı);
}
}