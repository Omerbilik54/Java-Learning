package Ornek3;

public class Main implements A,B {
    @Override
    public void selam() {
        A.super.selam();
        B.super.selam();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.selam();

    }
}
