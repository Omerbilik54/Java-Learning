public abstract class Room implements Bookable , Chargeable{
    private double pricePerNight;
    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber,double privePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = privePerNight;
        this.isAvailable = true;
    }
    @Override
    public void book(){
        this.isAvailable=false;
        System.out.println(roomNumber+" Oda rezerve edildi ");
    }
    @Override
    public void cancel(){
        this.isAvailable=true;
        System.out.println(roomNumber+" Rezervasyon iptal edildi");
    }
    @Override
    public abstract double calculatePrice(int days);

    public String displayDetails(){
        return "Room Number: " + roomNumber +
                ", Price Per Night: $" + pricePerNight +
                ", Available: " + isAvailable;
    }
    public double getPricePerNight(){
        return pricePerNight;
    }









}
