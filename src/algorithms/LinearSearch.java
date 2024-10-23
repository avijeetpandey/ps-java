package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LinearSearch {
    private static boolean search(List<Integer> collection, Integer target) {
        for (Integer integer : collection) {
            if (Objects.equals(integer, target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,6);

        boolean isPresent = search(list, 6);

        if (isPresent) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
    }
}
