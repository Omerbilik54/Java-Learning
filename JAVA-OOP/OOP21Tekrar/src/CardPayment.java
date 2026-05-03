// CardPayment --> KartOdeme
public class CardPayment implements PaymentStrategy {

    private final String cardNumber; // cardNumber --> kartNumarasi

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Kartla ödendi: " + amount + " kart: " + mask(cardNumber));
    }

    private String mask(String c) { // mask --> maskele
        if (c.length() <= 4) return c;
        return "****-****-****-" + c.substring(c.length() - 4); // substring --> altString
    }
}
