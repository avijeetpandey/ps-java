package examples;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // adding to list
        list.add("A");
        list.add("B");
        list.add("C");

        // removing from list
        list.remove("A");
        list.remove("B");

        // printing list
        System.out.println(list);

        System.out.println(list.contains("C"));
    }
}
