import java.util.*;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue + " Is an integer, it worked!");
            } catch (Exception e) {
                System.out.println("Error at index: " + i + " for the value of " + "'" + myList.get(i) + "'." + " This is a string so we can't cast it to an integer! Sorry!");
            }
        }
    }
}