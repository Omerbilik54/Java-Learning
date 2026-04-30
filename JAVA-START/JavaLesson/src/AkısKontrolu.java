public class AkısKontrolu {
    public static void main(String[] args) {

        // == sağdaki ve soldaki iki değer aynı mı ? anlamına gelir.
        // != sağdaki ve soldaki iki değer aynı değiller mi ) anlamına gelir.
        // < soldaki değer sağdaki değerden küçük mü ? anlamına gelir
        // > soldaki değer sağdaki değerden küçük mü ?
        // ! ifadesi herhangi bir değeri tam tersine çevirir .
        // >= büyük veya eşit
        // <= küçük veya eşit



        int sayi1 = 100;
        int sayi2 = 100;

        if (sayi1 == sayi2) {
            System.out.println("Evet sayılar eşittir . ");
        }


        int sayi3 = 150;
        int sayi4 = -200;
        if (sayi4 != sayi3) {
            System.out.println("Evet sayılar değildir . ");
        }
        System.out.println("Program bitti.");


        //Bu koşullardan birine girerse kalanına girmez .
        //Else son çare . Yani hiçbir koşul olmazsa ve else de varsa en son else çalışır


        if (sayi3 == 0){
            System.out.println("Evet 0 a eşit");

        }
        else if (sayi3==0) {
            System.out.println("Evet Büyük");

        } else if (sayi3<=0) {
            System.out.println("Evet küçük ");

        }
        else System.out.println("Güzel");
    }
}
