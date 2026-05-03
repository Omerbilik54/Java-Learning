public class Limon extends Meyve{
    private int asitOrani;

    public Limon(String isim , String renk ,  int asitOrani){
        super(isim,renk);
        this.asitOrani=asitOrani;
        System.out.println("Limon constructor çalıştı");
    }

    public int getAsitOrani() {
        return asitOrani;
    }
    public void setAsitOrani(int asitOrani){
        this.asitOrani=asitOrani;
    }
    @Override
    public void tatVer(){
        System.out.println("Limon ekşi bir tat veriyor . ( asit oranı : " + asitOrani + " )");
    }
}
