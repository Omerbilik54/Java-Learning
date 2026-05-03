package Ornek1;

public class Personal implements MaasAlabilir, IzınAlabilir {
    private int para;

    private boolean izinli;

    @Override
    public void izinAl(){
        izinli = true;
    }

    @Override
    public void maasAl(){
         para += 20_000;
    }



}
