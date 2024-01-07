// Write a Program to swap 2 Strings without a temporary Variable?
public class MockClass1 {


        public static void main(String[] args) {
            String firstString = "Hello";
            String secondString = "World";

            System.out.println("Before swapping:");
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);

            //1. Method:
            // Swap using concat method

            firstString = firstString + secondString;
            secondString = firstString.substring(0, firstString.length() - secondString.length()); // o,10-5=5(Hello)
            firstString = firstString.substring(secondString.length()); // HelloWorld= 5=initial index, 9=final index

            System.out.println("\nAfter swapping using concat method:");
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);


           // firstString = "World";
           // secondString = "Hello";

            //2. Method:
            // Swap using substring method

            firstString = firstString + secondString;
            secondString = firstString.substring(0, firstString.length() - secondString.length());
            firstString = firstString.substring(secondString.length());

            System.out.println("\nAfter swapping using substring method:");
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);


           // firstString = "World";
           //  secondString = "Hello";


        }
    }

      // Expected Output:
//_________________________________________________________________________________________________________

class T1{

        public static void main(String[] args) {
            String str1 = "Hello World!";
            String str2 = "My name is Alesia";

            str1 += str2; // This line means: str1 = str1 + str2;

            str2 = str1.substring(0, str1.length() - str2.length());
            str1 = str1.substring(str2.length());

            System.out.println(str1);
            System.out.println(str2);

        }
    }
