package ornek;

public class KomisyonluCalisan extends Calisan{
    private double satisMiktari;
    private double komisyonOrani;

    public KomisyonluCalisan(String ad,String soyad , String tcKimlik ,
                             double satisMiktari , double komisyonOrani){
        super(ad,soyad,tcKimlik);
        this.komisyonOrani=komisyonOrani;
        this.satisMiktari=satisMiktari;
    }

    @Override
    public double maasHesapla(){
        return satisMiktari*komisyonOrani;
    }

}
