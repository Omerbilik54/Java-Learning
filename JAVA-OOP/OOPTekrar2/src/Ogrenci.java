public class Ogrenci extends Kisi {
    private String okul;
    private double ortalama;

    //Constructor
    public Ogrenci(String ad, int yas, String okul, double ortalama) {
        super(ad, yas);//Üst sınıf Contructor'a eriştik
        this.okul = okul;
        this.ortalama = ortalama;
        System.out.println("Öğrenci constucter çalıştı");
    }
    //Getter Setter
    public String getOkul(){
        return okul;
    }
    public void setOkul(String okul){
        this.okul=okul;
    }
    public double getOrtalama(){
        return ortalama;
    }
    public void setOrtalama(double ortalama){
        this.ortalama=ortalama;
    }
    @Override
    public void bilgiVer(){
        System.out.println("Ben bir Öğrenciyim . Okulum : " + okul);
    }
    @Override
    public String toString(){
        return "Öğrenci{" + " Ad: " + getAd() + " yas: " + getYas() +  " Okul: " + okul + " Ortalama; " + ortalama + " }";
    }

}
