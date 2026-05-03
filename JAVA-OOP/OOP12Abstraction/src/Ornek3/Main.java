package Ornek3;

public class Main {
    public static void main(String[] args) {
        JavaRastgeleUretici jru = new JavaRastgeleUretici();
        for (int i = 0 ; i< 10 ;i++)
            System.out.print(jru.nextInt(100) + "  ");
    }
}
