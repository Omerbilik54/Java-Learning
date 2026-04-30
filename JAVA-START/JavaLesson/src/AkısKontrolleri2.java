public class AkısKontrolleri2 {

    public static void main(String[] args) {
        //System.out.println(romaRakamlari.charAt(i));   burda kalsın sonra bakarım .

//        I = 1
//        V = 5
//        X = 10
//        L = 50
//        C = 100
//        D = 500
//        M = 1000

        String romaRakamlari = "MCMXCIV";
        int  karakterinDegeri = 0 , oncekiKarakter = 0 , toplam = 0;



        for (int i = romaRakamlari.length() - 1; i >= 0 ; i--) {
            oncekiKarakter = karakterinDegeri ;

            karakterinDegeri = switch (romaRakamlari.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> -1;
            };
            if (karakterinDegeri==-1 ) {
                System.out.println("Hatalı bir giriş yaptınız");
                return;
            } else if (karakterinDegeri * 4 < oncekiKarakter) {
                toplam -= karakterinDegeri;
            } else toplam += karakterinDegeri;
        }
        System.out.println("Roma " + romaRakamlari + " = " + toplam);
    }
}
