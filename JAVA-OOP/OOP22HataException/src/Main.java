import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("Lütfen bir sayi1 giriniz");
            int sayi1 = scanner.nextInt();
            System.out.println("Lütfen bir sayi2 giriniz");
            int sayi2 = scanner.nextInt();
            //Eğer bunları kullanırken sorun çıkma ihtimali yoksa try cath'in içine almamalısın .
            System.out.println(sayi1/sayi2);


        } catch(ArithmeticException e){//istersen catchleri azaltabilirsin .
            //(ArithmeticException | InputException e) Böyle yaparsan karışıklık olmaz .
            //Veya onun yerine mesela catch içine ArithmeticException gibilerinin yerine Exception yazarsan bütün hataları yakalar
            //(Exception e)
            System.out.println(e);
            System.out.println("Hop kardeş sakin git lise matematik öğren ");


        }catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("Sayi gir başka birşey girme");
        }
        //----------------------------------------------------------------------------------------

        int[] arr = new int[5];

        try{
            for(int i = 0; i <= arr.length ; i++){
//                if(i==2){
//                    throw  new RuntimeException("Denemek için yazdım");
//                }
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println("Arrayin uzunl  uğu aşıldı.");
            System.out.println(e);
        }









    }
}