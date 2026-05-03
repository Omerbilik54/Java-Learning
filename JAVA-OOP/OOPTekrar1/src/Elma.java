public class Elma extends Meyve{
    private String tur;//Ek özellik

    //Constructer
    public Elma(String isim , String renk , String tur){
        super(isim , renk);//Üst sınıfın Constucterini çağır.
        this.tur=tur;
    }

    //Getter & Setter
    public String getTur() {
        return tur;
    }
    public void setTur(String tur){
        this.tur=tur;
    }

    @Override
    public void tatVer(){
        super.tatVer();//Üst sınıftaki metodu çağırır .
        System.out.println("Elma tatlı bir tat veriyor .");
    }
}
