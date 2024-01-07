// Create an Interface 'Shape' with undefined methods as calculateArea and
//calculatePerimeter. Create 2 classes Circle & Square that implements
//functionality defined in the Shape Interface. Test your code.

public class MockClass11 {
    public MockClass11(double v) {
    }

    // Shape Interface

    interface Shape {
        double calculateArea();

        double calculatePerimeter();
    }

    // Circle class implementing Shape interface
    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Square class implementing Shape interface
    static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }
}

