// // Check if a String is Palindrome: Determine whether a given String is a Palindrome, which means it
//// reads the same forwards and backward. For example, "madam" is a Palindrome?
//
public class MockClassP4 {
    public static void main(String[] args) {

        // How would you check if String is Palindrome or not?
        // This is an interview question:

        String str="Madam";
        String reversedWord="";
        for (int i = str.length()-1; i>=0; i--) {
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }

    }
}


