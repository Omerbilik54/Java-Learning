package Restorant;

public class Restorant {
    public void yemekSiparisiAl(Menu yemek){
        System.out.println(yemek + " Siparişi alındı.");
        System.out.println(yemek.getFiyat()+" Tl");
    }
}
