package Ornek1;

public class KrediKartiBorcOdeme implements OdemeYapilabilir {
    @Override
    public void ode(int tutar){
        System.out.println("Kredi kartı borcu " + tutar + " Tl ödendi ");
    }
    @Override
    public String getAciklama(){
        return "Kredi kartı borcu";
    }
    @Override
    public boolean onayGerekliMi(){
        return true;
    }
}
