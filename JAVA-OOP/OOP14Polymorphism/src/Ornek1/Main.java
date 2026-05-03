package Ornek1;

public class Main {
    public static void main(String[] args) {
        OdemeMotoru motor = new OdemeMotoru();
        motor.simdiOde(new Netflix(),90);
        motor.simdiOde(new ElektrikFaturasi(),850);//1000 tl altı onay yok
        motor.simdiOde(new ElektrikFaturasi(),1250);//1000 tl üstü onay ister
        motor.simdiOde(new KrediKartiBorcOdeme(),7500);//her zaman onay
        motor.simdiOde(new SteamCuzdan(),600);
    }
}
