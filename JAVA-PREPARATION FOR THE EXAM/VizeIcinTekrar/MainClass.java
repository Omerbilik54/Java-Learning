package VizeIcinTekrar;


import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {
        AccountExample();
    }

    private static void HumanExample(){
        Human human = new Human(34);
        Scanner scanner2= new Scanner(System.in);
        Human human2 = new Human(78,"Ömer" , 30);

        human2.age = 25;
        Human human3= new Human(87,"irem");
        Human[] humans={human , human2,human3};

        for (Human h:humans) {
            h.ShowInfo();
        }
    }
    private static void AccountExample(){
        Account account = new Account("My VizeIcinTekrar.Account" , 13434353);
        account.yatır(500);
    }
}



