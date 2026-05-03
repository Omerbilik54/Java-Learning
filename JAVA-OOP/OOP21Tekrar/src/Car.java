public class Car extends Vehicle{
    private final String model;
    private int seats;//Koltuk sayısı

    public Car(String model , String brand , int seats){
        super(100);
        this.model=model + "-" + brand;//marka
        this.seats= seats;
    }

    public String getModel(){
        return model;
    }
    @Override
    public double calculatePrice(int days){
        return basePrice * days + (seats > 4 ? 20 * days : 0);
    }

    public class Engine{//Engine -> Motor ( inner class )
        private int power;
        Engine(int power){
            this.power = power;
        }
        void start(){
            System.out.println("Engine started with " + power + "Hp");
        }
    }
    //Manufacturer -->Üretici ( static nested class )
    static class Manufacturer{
        static String getInfo(){
            return "Araç üreticisi bilgileri";
        }
    }
    @Override
    public String info(){
        return "Car[model=" + model + ", seats=" + seats + ", owner=" + getOwner() + "]";
    }
}
