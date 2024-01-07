// You have a list of String and want to keep only those that start with "A" and you want to return
// them in "lowercase"?


import java.util.ArrayList;
import java.util.List;
public class MockClass8 {


    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        strList.add("Hello world!");
        strList.add("Summer day");
        strList.add("Winter day");
        strList.add("Alesia Su");

        for(int i = 0; i < strList.size(); i++){
            if(strList.get(i).startsWith("A")){
                strList.set(i, strList.get(i).toLowerCase());
            }
        }


        System.out.println(strList);
    }
}
//_________________________________________________________________________________________________________________

class T8{
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        strList.add("Hello world!");
        strList.add("Summer day");
        strList.add("Winter day");
        strList.add("Alesia Su");

        for(int i = 0; i < strList.size(); i++){
            if(strList.get(i).startsWith("A")){
                strList.set(i, strList.get(i).toLowerCase());
            }
        }

        System.out.println(strList);
    }
}


