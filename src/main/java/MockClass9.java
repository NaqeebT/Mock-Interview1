//  Find the First Non-Repeating Character in a String: Given a string, find and
//return the first non-repeating character. For example, in the string
//"abracadabra", the first non-repeating character is 'c'?

public class MockClass9 {

        public static void main(String[] args) {


            String word = "abracadabra";
            boolean foundNonRepeating = false;

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                boolean isRepeated = false;

                for (int j = i + 1; j < word.length(); j++) {
                    if (currentChar == word.charAt(j)) {
                        isRepeated = true;
                        break;  // Exit the inner loop
                    }
                }

                if (!isRepeated) {
                    System.out.println("The first non-repeating character is: " + currentChar);
                    foundNonRepeating = true;
                    break;  // Exit the outer loop if you want to stop at the first non-repeating character
                }
            }

            if (!foundNonRepeating) {
                System.out.println("There is no non-repeating character in the String");
            }

        }}
//________________________________________________________________________________________________________________

class T9 {


    public static void main(String[] args) {

                String str = "abracadabra";

                for (int i = 0; i < str.length(); i++) {

                    if(str.indexOf(str.charAt(i), i+1) == -1){
                        System.out.println("First non repeated character " + str.charAt(i));
                        break;
                    }
                }
            }
        }



