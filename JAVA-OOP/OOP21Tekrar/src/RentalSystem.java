// RentalSystem --> KiralamaSistemi
class RentalSystem {

    private static java.util.Map<String, Vehicle> fleet = new java.util.HashMap<>();
    // fleet --> filodaki araçlar

    public static void initSampleData() { // sample --> örnek
        fleet.put("CAR1", new Car("ModelS", "Tesla", 4));
        fleet.put("BIKE1", new Bike("Mountain", true));
    }

    public static void printReceipt(Vehicle v) { // receipt --> fiş
        System.out.println("Receipt: " + v.info());
    }

    public static void printReceipt(Vehicle v, String note) { // note --> not
        printReceipt(v);
        System.out.println("Note: " + note);
    }

    public static Vehicle rentVehicle(String typeStr, String customer) {
        // rent --> kirala
        VehicleType type = VehicleType.valueOf(typeStr);
        Vehicle chosen;

        switch (type) {
            case CAR:  chosen = new Car("A4", "Audi", 5); break;
            case BIKE: chosen = new Bike("Road", true); break;
            default:   chosen = new Car("Default", "Brand", 2);
        }

        chosen.setOwner(customer);
        fleet.put(chosen.getId(), chosen);

        System.out.println(customer + " kiraladı: " + chosen.info());
        return chosen;
    }

    public static void returnVehicle(String id) throws RentalException {
        // returnVehicle --> araciIadeEt
        Vehicle v = fleet.get(id);
        if (v == null) throw new RentalException("Araç bulunamadı: " + id);
        v.setOwner(null);
        System.out.println("Araç iade edildi: " + v.getId());
    }
}
