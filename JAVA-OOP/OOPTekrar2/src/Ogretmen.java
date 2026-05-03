public class Ogretmen extends Kisi {
    private String brans;
    private double maas;

    //Contructor
    public Ogretmen(String ad, int yas, String brans, double maas) {
        super(ad, yas);//Üst sınıfın constructor'ını çağırıypruz.
        this.brans = brans;
        this.maas = maas;
        System.out.println("Öğretmen constructor çalıştı");
    }

    //Getter-Sette
    public String getBrans() {
        return brans;
    }

    public void setBrans(int maas) {
        this.brans = brans;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    //toString override
    @Override
    public String toString(){
        return "Öğretmen " + getAd() + " yaş: " + getYas() +" Branş : " + brans + " Maaş: " + maas ;
    }
}
