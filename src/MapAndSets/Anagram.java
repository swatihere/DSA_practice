package MapAndSets;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // If lengths are different, they cannot be anagrams
        if(str1.length() != str2.length()){
            System.out.println(false);
            return;
        }

        // Create a HashMap to store character frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Store characters of first string
        for(int i = 0; i < str1.length(); i++){

            char ch = str1.charAt(i); // Get current character

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);   // Increase the frequency by 1
            }
            else{
                map.put(ch, 1);  // If character is not present, add it with frequency 1
            }
        }

        // Remove characters using second string
        for(int i = 0; i < str2.length(); i++){

            char ch = str2.charAt(i);

            if(!map.containsKey(ch)){
                System.out.println(false);
                return;
            }

            map.put(ch, map.get(ch) - 1);   // Decrease the frequency of the character by 1
        }

        // Check if all frequencies became zero
        for(int value : map.values()){

            if(value != 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
