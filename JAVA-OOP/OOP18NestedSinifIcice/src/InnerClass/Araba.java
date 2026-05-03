package InnerClass;

public class Araba {
    private String marka = "Togg";

    public class Motor{
        public void bilgi (){
            System.out.println("Marka : " + marka);
        }
    }
}
