// Check if a String is Palindrome: Determine whether a given String is a Palindrome, which means it
// reads the same forwards and backward. For example, "madam" is a Palindrome?

public class MockClass4 {

        public static void main(String[] args) {
            // Example usage
            String inputString = "madam";
            boolean isPalindrome = checkPalindrome(inputString);

            System.out.println("Input String: " + inputString);
            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }

        // Function to check if a given string is a palindrome
        public static boolean checkPalindrome(String input) {
            // Convert the string to lowercase to make the comparison case-insensitive
            String lowercaseInput = input.toLowerCase();

            // Remove non-alphanumeric characters (considering only letters and digits)
            String cleanedInput = lowercaseInput.replaceAll("[^a-zA-Z0-9]", "");

            // Use two pointers to compare characters from start and end
            int start = 0;
            int end = cleanedInput.length() - 1;

            while (start < end) {
                if (cleanedInput.charAt(start) != cleanedInput.charAt(end)) {
                    // Characters at current positions are different, not a palindrome
                    return false;
                }

                // Move towards the center
                start++;
                end--;
            }

            // If the loop completes, the string is a palindrome
            return true;
        }
    }
//__________________________________________________________________________________________________

class T4{
    public static void main(String[] args) {
        String str = "madam";
        String strCheck = "";

        for(int i = str.length() - 1; i >= 0; i--){
            strCheck += str.charAt(i); // This line means:  strCheck = strCheck + str.charAt(i);
        }


        if(str.equalsIgnoreCase(strCheck)){
            System.out.println("Palindrome");
        }else System.out.println("Not a Palindrome");
    }
}











