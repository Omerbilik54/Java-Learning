public static void main(String[] args) {
    // Create rooms
    Room sRoom1 = new SingleRoom(101, 100.0);
    Room suite1 = new Suite(201, 200.0);

    // Display details
    System.out.println(sRoom1.displayDetails());
    System.out.println(suite1.displayDetails());

    // Book rooms
    sRoom1.book();
    suite1.book();

    // Calculate prices
    System.out.println("Single Room price for 3 days: $"
            + sRoom1.calculatePrice(3));
    System.out.println("Suite price for 3 days: $"
            + suite1.calculatePrice(3));

    // Cancel bookings
    sRoom1.cancel();
    suite1.cancel();
}