package Tekrar;
public class Main {
    public static void main(String[] args) {
        Tekrar.BlokDusme blokDusme = new Tekrar.BlokDusme();
        blokDusme.xNoktasi = 1;
        blokDusme.yNoktasi= 2;
        blokDusme.zNoktasi=2;
        blokDusme.koordinatlarıGetir();
        blokDusme.BloklariDusur();

        Tekrar.BlokYukariAsagi blokYukariAsagi= new Tekrar.BlokYukariAsagi();
        blokYukariAsagi.xNoktasi= 4;
        blokYukariAsagi.yNoktasi=5;
        blokYukariAsagi.zNoktasi=8;
        blokYukariAsagi.koordinatlarıGetir();

        blokYukariAsagi.BloklarYukari();
        blokYukariAsagi.BloklarAsagi();
    }
}