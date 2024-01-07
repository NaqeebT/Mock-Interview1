import java.util.Arrays;

// Check if two Strings are Anagrams: Given two Strings, determine if they are Anagrams, meaning they contain the
// same characters in different order. For example, "Listen" and "Silent" are Anagram?

public class MockClass5 {

        public static void main(String[] args) {
            // Example usage
            String str1 = "Listen";
            String str2 = "Silent";

            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }

        // Function to check if two strings are anagrams
        public static boolean areAnagrams(String str1, String str2) {
            // Convert strings to lowercase for case-insensitive comparison
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // Remove non-alphanumeric characters (considering only letters)
            str1 = str1.replaceAll("[^a-zA-Z]", "");
            str2 = str2.replaceAll("[^a-zA-Z]", "");

            // Check if the lengths are different after removing non-alphanumeric characters
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to character arrays and sort them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }
//______________________________________________________________________________________________________

class T5{
    public static boolean anagramCheck(String str, String str1){
        char[] charsArray = str.toCharArray();
        char[] charsArray1 = str1.toCharArray();

        if(str.length() != str1.length()){
            return false;
        }

        Arrays.sort(charsArray);
        Arrays.sort(charsArray1);

        for(int i = 0; i < charsArray.length; i++){
            if(charsArray[i] != charsArray1[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String str = "listen";
        String str1 = "litene";
        if(anagramCheck(str, str1)){
            System.out.println("Anagram!");
        } else System.out.println("Not an Anagram");


    }
}


