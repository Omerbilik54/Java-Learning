public class VehicleRentalDemo {

    public static void main(String[] args) {

        RentalSystem.initSampleData();

        Vehicle v1 = RentalSystem.rentVehicle("CAR", "Ali");
        Vehicle v2 = RentalSystem.rentVehicle("BIKE", "Ayşe");

        if (v1 instanceof Car) { // instanceof --> tür kontrolü
            System.out.println("v1 bir Car: " + ((Car) v1).getModel());
        }

        RentalSystem.printReceipt(v1);
        RentalSystem.printReceipt(v1, "İyi sürüşler!");

        PaymentStrategy cash = new PaymentStrategy() {
            @Override
            public void pay(double amount) {
                System.out.println("Nakit ödendi: " + amount);
            }
        };
        cash.pay(50);

        PaymentStrategy card = new CardPayment("1234-5678-9012-3456");
        card.pay(120);

        try {
            RentalSystem.returnVehicle(v1.getId());
            RentalSystem.returnVehicle("x");
        } catch (RentalException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        CustomerInfo info = new CustomerInfo("Mehmet", "mehmet@example.com");
        System.out.println(info);

        Car c = new Car("XYZ-202", "Tesla", 4);
        Car.Engine eng = c.new Engine(240);
        eng.start();

        System.out.println(java.util.Arrays.toString(VehicleType.values()));
    }
}
