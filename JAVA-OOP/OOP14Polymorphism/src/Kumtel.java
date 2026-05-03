public class Kumtel implements Serinletici, Isitici {
    @Override
    public double isit(){
        System.out.println("Isıtıyorum");
        return 0;
    }
    @Override
    public double serinlet(){
        System.out.println("Serinletiyorum");
        return 0;
    }
}
