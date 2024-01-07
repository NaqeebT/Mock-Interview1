 // Write a Program to swap 2 Numbers without a temporary Variable?

public class NumberSwapWithoutTempVariable {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;


        // Note: If we swap int using third Variable, the bellow 3 lines should be added.
       // int thirdNumber = 0;
       // thirdNumber=firstNumber;//5
      //  firstNumber=secondNumber;//10
      //  secondNumber=thirdNumber;//5

        System.out.println("Before swapping:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Swap using addition and subtraction
        firstNumber = firstNumber + secondNumber;   // 15
        secondNumber = firstNumber - secondNumber;  //  (15-10=5)
        firstNumber = firstNumber - secondNumber;   // (15-5=10)

        System.out.println("\nAfter swapping using addition and subtraction:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);




    }
}

// Expected Output
 // firstNumber = 10;
 // secondNumber = 5;
