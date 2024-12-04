import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Frosty The Snowman", "Frosty the snowman was a jolly happy soul, with a corncob pipe and a button nose");
        tracklist.put("Jingle Bells", "Jingle bells, jingle bells, jingle all the way! Oh what fun it is to ride in a one horse open sleigh");
        tracklist.put("Ms Jackson", "I'm sorry Ms. Jackson (ooh), I am for real. Never meant to make your daughter cry I apologize a trillion times");
        tracklist.put("Fortunate Son", "Some folks are born made to wave the flag, oooh they're red white and blue");
        Set<String> keys = tracklist.keySet();
        System.out.println("Lyrics for Ms Jackson: " + tracklist.get("Ms Jackson") + '\n');
        for(String key: keys){
            System.out.println("Song: " + key);
            System.out.println("Lyrics: " + tracklist.get(key) + '\n');
        }
        
    }
}