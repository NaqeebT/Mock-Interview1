
public class MockClass12Tester {
    public static void main(String[] args) {
        // Test for student A
        A studentA = new A(80, 90, 75);
        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");

        // Test for student B
        B studentB = new B(85, 92, 78, 88);
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}
