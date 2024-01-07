// Create a Class Car that would have the following fields: carPrice and color
//and method calculateSalePrice() which should be returning a price of the
//car.
//Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight
//and has its own implementation of calculateSalePrice() method in which
//returned price is calculated as following: if weight>2000 then returned price
//car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does its own implementation
//of calculateSalePrice(): if length of sedan is >20 feet then returned car price
//should include 5% discount, otherwise 10% discount?
public class MockClass13 {

    // Class Car
        private double carPrice;
        private String color;

        // Constructor
        public MockClass13(double carPrice, String color) {
            this.carPrice = carPrice;
            this.color = color;
        }

        // Method to calculate sale price (to be overridden by subclasses)
        public double calculateSalePrice() {
            return carPrice; // Default implementation
        }
    }

    // Subclass Truck
    class Truck extends MockClass13 {
        private double weight;

        // Constructor for Truck
        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        // Override calculateSalePrice method for Truck
        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                return super.calculateSalePrice() * 0.9; // 10% discount for weight > 2000
            } else {
                return super.calculateSalePrice() * 0.8; // 20% discount for weight <= 2000
            }
        }
    }

    // Subclass Sedan
    class Sedan extends MockClass13 {
        private double length;

        // Constructor for Sedan
        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        // Override calculateSalePrice method for Sedan
        @Override
        public double calculateSalePrice() {
            if (length > 20) {
                return super.calculateSalePrice() * 0.95; // 5% discount for length > 20
            } else {
                return super.calculateSalePrice() * 0.9; // 10% discount for length <= 20
            }
        }
    }


