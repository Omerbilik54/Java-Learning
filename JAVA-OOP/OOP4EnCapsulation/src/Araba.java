public class Araba {
    private double speed ;
    private double surtunme ;
    private double ruzgar;
    public Araba(){
        speed = 0;
        surtunme=2;
        ruzgar = 5;
    }
    public void arabaSur(int _speed){
        speed = _speed - surtunme -ruzgar;
        System.out.println("Araba sürülüyor Hız : " + speed);
    }
}
//Burayı kullanmak daha mantıklı .
