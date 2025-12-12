package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int arrayLength = array.length;
        for(int i=0; i< arrayLength-1; i++) {
            for(int j=0; j < arrayLength - i -1 ; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {99, -1, 0, 5, 87, 43};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
