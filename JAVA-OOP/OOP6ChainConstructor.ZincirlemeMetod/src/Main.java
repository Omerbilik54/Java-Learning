public class Main{
    public static void main(String[] args) {
        Personal personal1 = new Personal("Ömer" , "Bilik" , 25  );
        Personal personal2 = new Personal("Ömer" , "Bilik");
        Personal personal3 = new Personal("Ömer" );

        personal1.Yazdır();
        personal2.Yazdır();
        personal3.Yazdır();

    }
}