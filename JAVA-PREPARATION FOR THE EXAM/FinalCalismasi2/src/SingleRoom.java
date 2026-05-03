public class SingleRoom extends Room{
    public SingleRoom(int roomNumber,double pricePerNight){
        super(roomNumber,pricePerNight);
    }

    @Override
    public double calculatePrice(int days) {
        return getPricePerNight()*days;
    }

}
