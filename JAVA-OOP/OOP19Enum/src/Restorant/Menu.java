package Restorant;

public enum Menu {
    Kelle_Paca(100,"Ömer"),
    TAVUK_SIS(150,"Onur");

    private final double fiyat;
    private  String isim;

    Menu(double fiyat , String isim){
        this.fiyat = fiyat;
    }

    public double getFiyat(){
        return fiyat;
    }
}
//Enum sabitleri = hazır nesneler
//Sen oluşturmazsın, Java otomatik oluşturur
//Bu yüzden doğrudan kullanabilirsin

