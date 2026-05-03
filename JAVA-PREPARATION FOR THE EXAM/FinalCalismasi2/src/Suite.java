public class Suite extends Room{
    public Suite(int roomNumber, double pricePerNight){
        super(roomNumber,pricePerNight);
    }
    public double calculatePrice(int days){
        return (getPricePerNight()+50)*days;
    }
}
