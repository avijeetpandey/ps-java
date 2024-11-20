package examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        //adding to set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // removing from set
        set.remove(1);

        // check
        var result = set.contains(1);
        System.out.println(result);

        // print the set
        set.forEach(System.out::println);
    }
}
