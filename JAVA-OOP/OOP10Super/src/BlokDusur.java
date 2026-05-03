public class BlokDusur extends HareketliAlan{
    private double egim ;
    public BlokDusur(int x,int y , int z , double egim){
        super(x,y,z);
        this.egim=egim;
    }
    @Override
    public void koordinatlariGetir(){
        super.koordinatlariGetir();
        System.out.println("Eğim: " + egim);
    }
}