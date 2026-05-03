package Ornek1;

public class SteamCuzdan implements OdemeYapilabilir{

    @Override
    public void ode(int tutar){
        System.out.println("Steam cüzdanına " + tutar + " Tl yüklendi .");
    }
     @Override
     public String getAciklama(){
        return "Steam cüzdan yükleme ";
     }

    @Override
    public boolean onayGerekliMi() {
        return false;
    }
}
