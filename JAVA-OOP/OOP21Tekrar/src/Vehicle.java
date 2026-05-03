public abstract class Vehicle {//Araç
    private static int counter = 0; //Sayaç
    private final String id;
    private String owner;//Sahibi
    protected double basePrice;//Temel fiyat

    public Vehicle(double basePrice){//Constructer
        this.id= "V-" + (++counter);
        this.basePrice=basePrice;
    }

    public String getId(){
        return id;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public abstract double calculatePrice(int days);//fiyat hesapla

    public String info(){//Bilgi
        return  "Vehicle[id=" + id + ", owner=" + owner + "]";
    }
}
