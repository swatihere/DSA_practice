package MapAndSets;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);  //get current character

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);  // Increase the count of character by 1
            }
            else{
                map.put(ch,1);   // If character appears for the first time, store count as 1
            }
        }
        System.out.println(map);
    }
}
