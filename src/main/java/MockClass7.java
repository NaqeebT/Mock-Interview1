// Count the Number of Words in a String: Write a function to count the number of words in a given String:
// Words are separated by spaces or punctuation. For example, the input "Hello, World" should return 2?

public class MockClass7 {


        public static void main(String[] args) {
            String str = "Hello, world!";
            int count = countWords(str);
            System.out.println("Number of words: " + count);
        }

        public static int countWords(String str) {
            if (str == null || str.isEmpty()) {
                return 0;
            }
            // Using regular expression to split the input string by spaces or punctuation

            String[] words = str.split(" ");
         //   String[] words = str.split("\\s+");
            return words.length;
        }
    }

//______________________________________________________________________________________________________
class T7{
    public static void main(String[] args) {
        String str = "Hello, world Alesia?";


        str = str.trim();
        String[] world = str.split("\\P{L}+");


        System.out.println(world.length);

    }
}


