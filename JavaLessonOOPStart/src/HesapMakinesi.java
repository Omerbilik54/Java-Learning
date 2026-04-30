public class HesapMakinesi {
    double toplam = 0;

    void topla(double sayi1 , double sayi2){
        toplam += sayi1 + sayi2;

    }
    void topla(double sayi3){
        toplam += sayi3;
    }

    Double hesapMakinesindekiDegeriDondur(){

        return toplam;
    }
}
