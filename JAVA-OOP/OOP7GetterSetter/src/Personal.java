public class Personal {
    private String isim;
    private String calistigiBolum;
    private int yas;
    public Personal(String isim, String calistigiBolum, int yas) {
        this.isim = isim;
        this.calistigiBolum = calistigiBolum;
        this.yas = yas;
    }
    public String getisim() {//Private olan bir bir değişkenin değerini dışarıya göstermek için kullanılır .
        return this.isim;
    }
    public String getcalistigiBolum() {
        return this.calistigiBolum;
    }
    public int getYas() {
        return this.yas;
    }
    public void setyas(int yas) {//Bir değişkenin değerini değiştirmek için kullanılır .
        this.yas = yas;
    }
    public void setcalistigiBolum(String calistigiBolum) {
        this.calistigiBolum = calistigiBolum;
    }
    public void setisim(String isim) {
        this.isim = isim;
    }
    public void yazdir(){
        System.out.println(getisim()+getcalistigiBolum()+getYas());
    }
}
