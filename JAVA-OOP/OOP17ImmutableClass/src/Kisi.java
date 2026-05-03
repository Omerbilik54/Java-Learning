public class Kisi {
    private final String isim;

    private final int yas ;

    public Kisi(String isim ,int yas){
        this.isim= isim;
        this.yas = yas ;
    }

    public String getIsim(){
        return isim;
    }

    public int getYas(){
        return yas;
    }

    public Kisi yasArtir(){
        return new Kisi(this.isim , this.yas +1);
    }


}




