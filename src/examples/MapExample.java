package examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // finding an element into the map
       boolean containsKey =  map.containsKey("e");

       if(containsKey) {
           System.out.println("Key is present");
       } else {
           System.out.println("Desired key is not present");
       }

       // removing an element from the map
        map.remove("c");

       // print the map
        for(Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println("KEY: " +  en.getKey());
            System.out.println("VALUE: " +  en.getValue());
        }
    }
}
