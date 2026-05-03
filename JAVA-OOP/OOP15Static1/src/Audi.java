public class Audi extends Araba{

    public static void tekerlekleriDegistir(){
        System.out.println("Tekerlekleri Değiştirin");
    //Statik olduğu için bunu override edemiyorsun . Ama zaten gerekte yok .
    }

    @Override
    public void selektorYap() {
        super.selektorYap();
    }
}


