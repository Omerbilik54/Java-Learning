package ornek;

public class SabitArtıKomisyonluCalisan extends KomisyonluCalisan{
    private double sabitMaas;

    public SabitArtıKomisyonluCalisan(String ad , String soyad , String tcKimlik , double sabitMaas ,
                                      double satisMiktari , double komisyonOrani){
        super(ad , soyad , tcKimlik , satisMiktari , komisyonOrani);
        this.sabitMaas=sabitMaas;
    }

    @Override
    public double maasHesapla(){
        return sabitMaas + super.maasHesapla();
    }
}
