package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    // implementation of selection sort
    public static void selectionSort(int[] array) {
        int lengthOfArray = array.length;

        /*
         * 1. Iterate and find the smallest element in the array
         * 2. Maintain the index of the smallest element
         * 3. Swap the minElement with the current element
         * 4. Repeat the same process till there are no elements left
        */

        for(int i=0; i< lengthOfArray; i++) {
            // min index
            int minIndex = i;

            // finding the smallest element and storing its index
            for(int j = i+1; j< lengthOfArray; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // swapping the found min element of the array
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }



    public static void main(String[] args) {
        int[] arr = {64, 12, 12, 22, 11, -5};
        selectionSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}
