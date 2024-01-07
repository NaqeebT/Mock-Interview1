// Find out how many alpha characters are present in a String?

public class MockClass2 {


    public static void main(String[] args) {
        String inputString = "Hello123World";

        int alphabetCount = countAlphabets(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Number of Alphabets: " + alphabetCount);
    }

    public static int countAlphabets(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                count++;
            }

        }
        return count;
    }

}

//___________________________________________________________________________________________________
class T2{
    public static void main(String[] args) {

        String str = "Hello world 123  jhfgd454 jh4jg5 jjk 454";

        int strAlphaCount = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println(strAlphaCount);

    }
}

