package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // adding elements to the list
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);


        // adding multiple elements at the same time
        List<Integer> bulkList = Arrays.asList(1,2,3,4,5);

        System.out.println(list);
        System.out.println(bulkList);

        // sorting the array
        int[] unsortedList = new int[] {20,6,-12,90,88,100};
        Arrays.sort(unsortedList);
        System.out.println(Arrays.toString(unsortedList));

        // sorting to a certain range
        int[] unsortedRangeList = new int[] {20,6,-12,90,88,100};
        Arrays.sort(unsortedRangeList,2, unsortedRangeList.length-1);
        System.out.println(Arrays.toString(unsortedRangeList));
    }
}
