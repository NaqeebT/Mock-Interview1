// How can you remove all duplicates from ArrayList?

import java.util.*;

public class MockClass10 {
    public static void main(String[] args) {
        // Create an ArrayList with duplicates
        ArrayList<String> originalList = new ArrayList<>();
        List<String> updatedList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        originalList.add("apple");
        originalList.add("grape");
        originalList.add("banana");

        System.out.println("List with duplicates "+originalList);
        Set<String> set=new HashSet<>(originalList);

        updatedList.addAll(set);

        System.out.println("List without duplicates " +updatedList);

    }
}
//_____________________________________________________________________________________________________________

class T10{

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();

        stringList.add("Alesia");
        stringList.add("Have a good day!");
        stringList.add("Alesia");
        stringList.add("Hello");
        stringList.add("Alesia");

        Set<String> setList = new LinkedHashSet<>(stringList);

        stringList.clear();

        stringList.addAll(setList);
        setList.clear();

        System.out.println(stringList);




    }
}






