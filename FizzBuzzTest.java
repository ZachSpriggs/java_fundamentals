import java.util.*;
public class FizzBuzzTest {
    public static void main(String[] args){
        // FizzBuzz iD = new FizzBuzz();
        // List<String> fizzy = iD.fizzBuzz(33);
        // System.out.println(fizzy);
        System.out.println(characterCount("zachary"));
    }
    public static Map<String, Integer> characterCount(String s) {
      // implement solution here
      char[] sArr = s.toCharArray();
      Map<String, Integer> charCount = new HashMap<String, Integer>();
      for(char c : sArr){
        if(charCount.containsKey(Character.toString(c))){
          charCount.put(Character.toString(c), charCount.get(Character.toString(c)) + 1);
        } else {
          charCount.put(Character.toString(c), 1);
        }
      }
      return charCount;
    }
}