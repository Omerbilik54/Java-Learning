package ornek;
// soyut sınıf (abstract class)
abstract class Calisan {
    // Encapsulation: veriler private, erişim getter/setter ile
    private String ad;
    private String soyad;
    private String tcKimlik;
    private double maas;// net maaş (hesaplandıktan sonra)

    public Calisan(String ad , String soyad , String tcKimlik ){
        this.ad= ad;
        this.soyad= soyad;
        this.tcKimlik=tcKimlik;
    }
    // ABSTRACT METHOD → Abstraction'un kalbi burada!
    // "Her çalışan maaşını farklı hesaplar ama HANGİ ÇALIŞAN OLDUĞUNU BİLMEDEN maaş hesaplanamaz"
    public abstract double maasHesapla();// soyut metot (gövdesiz)

    // Concrete (somut) metot → tüm çalışanlarda aynı
    public void maasYatir(){
        this.maas=maasHesapla();
        System.out.printf("%s %s > Aylık Maaş : %.2f TL yatırıldı.%n",ad,soyad,maas);
    }

    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public String getTcKimlik() {
        return tcKimlik;
    }
    public double getMaas() {
        return maas;
    }
}
