package Ornek3;

import java.util.Random;

public class JavaRastgeleUretici extends SayiUreteci{

    private Random random ;

    @Override
    public void setSeed(int seed){
        random = new Random(seed);
    }

    @Override
    public int nextInt(int number){
        return random.nextInt(number);
    }
}
