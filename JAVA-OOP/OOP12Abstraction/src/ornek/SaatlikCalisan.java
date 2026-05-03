package ornek;

public class SaatlikCalisan extends Calisan {
    private double saatlikUcret ;
    private int calisilanSaat;

    public SaatlikCalisan(String ad ,String soyad , String tcKimlik , double saatlikUcret , int calisilanSaat){
        super(ad , soyad , tcKimlik);
        this.calisilanSaat=calisilanSaat;
        this.saatlikUcret=saatlikUcret;
    }

    @Override
    public double maasHesapla(){
        return saatlikUcret*calisilanSaat;
    }
}
