public class Main{
    public static void main() {
        //Sol taraf ne yapabileceğini söyler sağ taraf ise hangi sınıfı kullandığımızı belirtir.
        Oda oda = new Oda();
        Ev ev = new Ev(oda);
        Kumtel kumtel = new Kumtel();
//      Serinletici kumtel = new Kumtel();
        Klima klima = new Klima();
        Isitici soba = new Soba();
        oda.odayiIsit(kumtel);
        ((Isitici) klima).isit();

        boolean isiticiMi = kumtel instanceof Isitici;//Bu instamceof metodu  bir nevi bu çpcuk kimin anlamına geliyor.
        boolean serinleticiMi = soba instanceof Serinletici;
        System.out.println(isiticiMi);
        System.out.println(serinleticiMi);

    }
}