package algorithms.searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Binary Search conditions
 *  - array needs to be sorted
 *  - access to any element should take constant time
 *  Time-Complexity
 *   - O(logN) , because in every operation the array is being divided into exactly half
 *   Logic to implement binary search
 *    - if the target element is greater than the middle element
 *          - shift startIndex to the middleIndex + 1
 *    -  if the target element is less than the middle element
 *          - shift the end element to the midIndex -1
 */

public class BinarySearch {

    public static int binarySearch(List<Integer> elements, int target) {
        int startIndex = 0;
        int endIndex = elements.size() - 1;

        while(startIndex < endIndex) {
            int middleIndex = (endIndex + startIndex) / 2;

            if (elements.get(middleIndex) == target) {
                return middleIndex;
            }

            if(elements.get(middleIndex) < target) {
                startIndex = middleIndex + 1;
            }

            if(elements.get(middleIndex) > target) {
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(2,0,-1,6,5,7,8,4);
        Collections.sort(elements);
        System.out.println(binarySearch(elements, 7));
    }
}
