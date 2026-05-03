package Ornek1;

public class ElektrikFaturasi implements OdemeYapilabilir{
    String aboneNo = "123456789";
    @Override
    public void ode(int tutar){
        System.out.println(aboneNo+" Nolu fatura "+ tutar +" Tl ödendi");
    }
    @Override
    public String getAciklama(){
        return  "Elektrik faturası";
    }
    @Override
    public boolean onayGerekliMi(){
        int tutar = 0;
        return tutar>1000;
    }

}
