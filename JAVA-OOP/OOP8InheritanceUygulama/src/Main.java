public class Main {
    public static void main(String[] args) {
        BlokYukariAsagi blokYukariAsagi = new BlokYukariAsagi();
        blokYukariAsagi.xnoktasi = 1;
        blokYukariAsagi.ynoktasi = 1;
        blokYukariAsagi.znoktasi = 1;
        blokYukariAsagi.koordinatlariGetir();
        blokYukariAsagi.blokAsagi();
        blokYukariAsagi.blokYukari();

        BlokDusur blokDusme = new BlokDusur();
        blokDusme.xnoktasi=2;
        blokDusme.ynoktasi=5;
        blokDusme.znoktasi=7;
        blokDusme.bloklariDusur();


    }
}