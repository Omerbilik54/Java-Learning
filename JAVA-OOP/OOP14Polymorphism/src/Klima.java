public class Klima implements Serinletici, Isitici {
    @Override
    public double isit(){
        System.out.println("Klima ısıtıyor");
        return 0;
    }

     @Override
    public double serinlet(){
        System.out.println("Klima serinletiyor");
        return 0;
     }
}
