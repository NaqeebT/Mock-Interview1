import java.util.ArrayList;

// Create a Method to count how many vowels are present in a String "documentation"?
public class MockClass6 {

        public static void main(String[] args) {

            String inputString = "documentation";

            // Call the method to count vowels
            int vowelCount = countVowels(inputString);

            // Print the result
            System.out.println("Number of vowels in the string: " + vowelCount);
        }

        // Method to count vowels in a string
        public static int countVowels(String str) {
            // Convert the string to lowercase to handle both uppercase and lowercase vowels
            str = str.toLowerCase();

            int count = 0;

            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Check if the character is a vowel (a, e, i, o, u)
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            // Return the total count of vowels
            return count;
        }
    }
//__________________________________________________________________________________________________________________
class T6{
    public static void main(String[] args) {
        String str = "Hello world";
        int count = 0;
        String vow = "aeiou";

        ArrayList<Character> vowList= new ArrayList<Character>();

        for (int i = 0; i < vow.length(); i++){
            vowList.add(vow.charAt(i));
        }

        for (int i = 0; i < str.length(); i++){
            if(vowList.contains(str.charAt(i))){
                count++;
            }
        }

        System.out.println(count);


    }
}


