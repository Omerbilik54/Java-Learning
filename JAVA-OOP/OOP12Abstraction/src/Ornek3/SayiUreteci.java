package Ornek3;

public abstract class SayiUreteci {
    public SayiUreteci(){
        setSeed((int) System.currentTimeMillis());
    }

    public abstract void setSeed(int seed);
    //0 ile number arasında sayı üretmek için .
    public abstract int nextInt(int number);
}
