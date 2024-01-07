// Reverse a String: Write a function to reverse a given String. For example, given the input "Hello",
// the output should be "olleH"?

public class MockClass3 {
    public static void main(String[] args) {


        String words = "Hello";
        String reverseString = Reverse(words);
        System.out.println("String before reverse " + words);
        System.out.println("String after reverse "+ reverseString);
    }
    private static String Reverse(String input) {
        String str = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            str = str + input.charAt(i);
        }
        return str;

    }}
//___________________________________________________________________________________________________________

class T3{
    public static String reverseString(String str){
        String strResult = "";
        if (str.isEmpty() || str.length() == 1){
            return str;
        }
        for(int i = str.length()-1; i >= 0; i--){
            strResult += str.charAt(i);
        }

        return strResult;
    }
    public static void main(String[] args) {
        String reverse = reverseString("Hello world");

        System.out.println(reverse);
    }
}



