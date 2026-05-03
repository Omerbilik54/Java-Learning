// CustomerInfo --> MusteriBilgisi
final class CustomerInfo { // final --> değiştirilemez sınıf
    private final String name; // name --> isim
    private final String email; // email --> eposta

    public CustomerInfo(String name, String email) {
        if (name == null || email == null)
            throw new IllegalArgumentException("Null olamaz");
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() { return "CustomerInfo[name=" + name + ", email=" + email + "]"; }
}
