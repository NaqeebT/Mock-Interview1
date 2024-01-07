// Test class
public class MockClass11Tester {
    public static void main(String[] args) {
        // Testing Circle
        MockClass11.Circle circle = new MockClass11.Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Testing Square
        MockClass11.Square square = new MockClass11.Square(4.0);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
