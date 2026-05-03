public class Main {
    public static void main(String[] args) {
        BlokDusur blokDusur = new BlokDusur(1 , 5 , 2 , 0.6);
        BlokAsagiYukari blokAsagiYukari= new BlokAsagiYukari(5,10,20);

        //BlokDusur egimleBlokDusur = new BlokDusur(3,5,7 ,0.5);
        blokDusur.koordinatlariGetir();
        blokAsagiYukari.koordinatlariGetir();
        blokDusur.koordinatlariGetir();
    }
}