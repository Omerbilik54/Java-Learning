public class Meyve{
    private String isim;
    private String renk ;

    public Meyve(String isim, String renk){
        this.isim=isim;
        this.renk = renk;
        System.out.println("Meyve constructor çalıştı");
    }
    public String getIsim(){
        return isim;
    }
    public String getRenk(){
        return renk;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public void setRenk(String renk){
        this.isim=isim;
    }
    public void tatVer(){
        System.out.println(isim + " tat veriyor");
    }
}
