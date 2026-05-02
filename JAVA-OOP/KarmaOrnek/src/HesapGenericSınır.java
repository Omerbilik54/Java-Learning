public class HesapGenericSınır <T extends Number>{
    T sayi;
    public HesapGenericSınır(T sayi){
        this.sayi = sayi;
    }
    double doubleDeger () {
        return sayi.doubleValue();
    }






}
