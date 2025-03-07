## Sorting Algorithms :tada: :rocket:
Sorting is technique to arrange elements in either ascending or descending order in a given collection / arrays of number, there are different kind of sorting algorithms.

1. Selection Sort
2. Insertion Sort
3. Bubble Sort
4. Quick Sort
5. Heap Sort
6. Merge Sort

### Selection sort
Selection sort works on a simple philosophy , find the smallest item and swap it with the current element , and do it till every element of the array is processed.
`Time Complexity` - `O(N^2)`

```java
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
```

- Selection sort is only useful for smaller data sets , as it is simple and easy to implement, however due to its time complexity it is not useful for larger data sets.