// Bike --> Bisiklet
public class Bike extends Vehicle {

    private boolean hasHelmet; // hasHelmet --> kaskVarMi

    public Bike(String type, boolean hasHelmet) {
        super(20.0);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculatePrice(int days) {
        return basePrice * days + (hasHelmet ? 2 * days : 0);
    }

    @Override
    public String info() {
        return "Bike[helmet=" + hasHelmet + ", owner=" + getOwner() + "]";
    }
}
