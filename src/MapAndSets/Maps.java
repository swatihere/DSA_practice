package MapAndSets;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>(); //it contain key and value
        map.put("Swati" , 23);
        map.put("Daniel" , 24);
        map.put("Ishita" , 21);
        map.put("Raghav" , 26);

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("Swati")); //we have to write key to gett the value

        System.out.println(map.remove("Daniel"));

        System.out.println(map);
        System.out.println(map.size());

        map.put("Raghav" , 27);
        System.out.println(map);

        for(String key : map.keySet()){  //here we traverse through key
            System.out.println(key+" : "+map.get(key));
        }
    }
}
