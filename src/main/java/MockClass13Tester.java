// Test class
public class MockClass13Tester {
    public static void main(String[] args) {
        // Test Truck
        Truck truck = new Truck(30000, "Red", 2500);
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());

        // Test Sedan
        Sedan sedan = new Sedan(25000, "Blue", 18);
        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
    }
}
