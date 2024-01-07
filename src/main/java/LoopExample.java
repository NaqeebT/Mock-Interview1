public class LoopExample {

    public static void main(String[] args) {


        int i;
        for (i = 10; i >= 0; i--) {
      //      System.out.println(i);
        }
        for (i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }
}
//______________________________________________________________________________________________________________
class T0{


        public static void main(String[] args) {
            for (int i = 10; i >= 0; i--) {
                System.out.println("i = " + i);
            }
        }
    }
//____________________________________________________________________________________________________________________
// This is how we reserve the words using for loop.
// Input: "Jackson"
// Output: "n o s k c a J"

class TV{

    public static void main(String[] args) {
        char []words={'J','a','c','k','s','o','n'};
        for (int i= words.length-1; i>=0; i-- ){
            System.out.print(words[i]+" ");
        }

    }
}

