import java.util.*;

public class PuzzleJava{
    public static void main(String[] args) {
        // System.out.println(sumAndArray());
        // System.out.println(shuffleArr());
        System.out.println(shuffleAlphabet());
        // System.out.println(randNumArrayList());
        // System.out.println(sortArrayList());
        // System.out.println(randomString());
        // System.out.println(tenRandomString());
    }

    public static ArrayList<Integer> sumAndArray(){
        int[] someArray = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < someArray.length; i++){
            if(someArray[i] > 10){
                newArray.add(someArray[i]);
            }
            sum += someArray[i];
        }
        System.out.println(sum);
        return newArray;
    }

    public static ArrayList<String> shuffleArr(){
        String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        List<String> arrList = Arrays.asList(arr);
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newArr.add(arr[i]);
            }
        }
        Collections.shuffle(arrList);
        System.out.println(arrList);
        return newArr;
    }

    public static ArrayList<String> shuffleAlphabet(){
        String[] arr = {"a", "b", "c", "d",
        "e", "f", "g", "h", "i", "j", "k", "l", "m", 
        "n", "o", "p", "q", "r", "s", "t", "u", "v", 
        "x", "y", "z"};
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            newArr.add(arr[i]);
        }
        Collections.shuffle(newArr);
        System.out.println("Last letter is: " + newArr.get(newArr.size()-1));
        if(newArr.get(0) == "a" || newArr.get(0) == "e" || newArr.get(0) == "i" || newArr.get(0) == "o" || newArr.get(0) == "u"){
            System.out.println("The first letter is a vowel!");
        }
        return newArr;
    }

    public static ArrayList<Integer> randNumArrayList(){
        int min = 55;
        int max = 100;
        Random r = new Random();
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            newArr.add(r.nextInt(max - min) + min);
        }
        return newArr;
    }

    public static ArrayList<Integer> sortArrayList(){
        int min = 55;
        int max = 100;
        Random r = new Random();
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            newArr.add(r.nextInt(max - min) + min);
        }
        Collections.sort(newArr);
        System.out.println("Minimum value: " + newArr.get(0) + " Maximum value: " + newArr.get(newArr.size()-1));
        return newArr;
    }

    public static String randomString(){
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabet = upperAlphabet + lowerAlphabet;
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int length = 5;
        for(int i = 0; i < 5; i++){
            int index = r.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String newStr = sb.toString();
        return newStr;
    }

    public static ArrayList<String> tenRandomString(){
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            newArr.add(randomString());
        }
        return newArr;
    }
}