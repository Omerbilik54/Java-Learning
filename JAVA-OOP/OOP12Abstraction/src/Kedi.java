public class Kedi extends Hayvan{
    @Override
    public  void sesCikar(){
        yuru();
        System.out.println("Miyav");
    }
    @Override //İster içine parametre verirsin istersen vermezsin .
    public void sesCikarsin(String ses){
        System.out.println("Miyavlasın " + ses);
    }


}
