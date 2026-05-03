public class Personal {
    private String isim ;
    private int yas ;

    public Personal(String isim , int yas){
        this.isim=isim ;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "İsim : " + isim + " "+ " Yaş: " + yas ;
    }
}

