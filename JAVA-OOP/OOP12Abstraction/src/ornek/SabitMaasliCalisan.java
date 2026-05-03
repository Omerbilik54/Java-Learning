package ornek;
public class SabitMaasliCalisan extends Calisan{
    private double aylikMaas;

    public SabitMaasliCalisan(String ad , String soyad , String tcKimlik , double aylikMaas){
        super(ad,soyad,tcKimlik);
        this.aylikMaas=aylikMaas;
    }

    @Override
    public double maasHesapla(){
        return aylikMaas;
    }






}
