import java.util.Scanner;

public class IcIceIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yas = scanner.nextInt();

        if (yas>18){
            if (yas>25){
                if (yas>50){
                    System.out.println("3. yere girmeye hak kazandınız ");
                }
                else if (yas>60) {
                }
                else{
                }
                System.out.println("2. yere girmeye hak kazandınız");
            }
            System.out.println("1. yere girmeye hak kazandınız");
        }
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " " + i * j);
            }
        }
        int i = 100;
        do {
            System.out.println(i + " ");
            i++;
        }while (i < 10 );
        i = 100;
    }
}
