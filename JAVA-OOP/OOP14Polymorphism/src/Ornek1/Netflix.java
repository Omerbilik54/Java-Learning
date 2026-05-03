package Ornek1;

public class Netflix implements OdemeYapilabilir{
    @Override
    public void ode(int tutar){
        System.out.println("Netflixe " + tutar + "Tl ödendi " );
    }
    @Override
    public String getAciklama(){
        return "Netflix Aylık";
    }
    @Override
    public boolean onayGerekliMi(){
        return false ;
    }
}

