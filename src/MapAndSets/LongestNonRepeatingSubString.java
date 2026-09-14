package MapAndSets;

import java.util.HashMap;

public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
        String str = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int i = 0 ;
        int j = 0 ;
        int maxLength = 0;

        while (j < str.length()) {
            char ch = str.charAt(j);     // Get the current character

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);    // Add the current character to the map
            }
            else{
                map.put(ch, 1);
            }
            while(map.get(ch) > 1){
                char remove = str.charAt(i);    // Get the character at i

                map.put(remove, map.get(remove) - 1);
                // Decrease its frequency

                i++;
            }
            int length = j - i + 1;   // Calculate current window length

            maxLength = Math.max(maxLength, length); //update max length

            j++;
        }
        System.out.println("Longest length: " + maxLength);

    }
}
