public class Kisi {
    private String ad;
    private int yas;
    //Constructor
    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
        System.out.println("Kişi Constructer çalıştı .");
    }
    //Getter && Setter ( Encapsulation )
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        if (yas < 0) {
            System.out.println("Yaş negatif olamaz .");
        } else {
            this.yas = yas;
        }
    }
    //Metot
    public void bilgiVer() {
        System.out.println("Ben bir kişiyim . ");
    }
    //toString Override
    @Override
    public String toString() {
        return "Kisi{" + "ad='" + ad + '\'' + ", yas=" + yas + '}';
    }
}
