# Algorithms

## Merge sort

- Based on **Divide and conquer algorithm**
- The Algorithn works on the three primary steps
  - **Divide** - divide the array into two halves untill it can no more be divided.
  - **Conquer** - each subarray is sorted individually using the merge sort algorithm
  - **Merge** - the sorted subarrays are merged back together in sorted order untill all the elements from both the subarrays have been merged

**Complexity of the merge sort** `O(n log n)`

## Bubble sort

In bubble sort the idea is simple, you iterate over the array compare the elements and swap them if the later is smaller than the former, in the worst case the complexity is **O(N^2)** and the number of operations it takes to complete the sorting of the array having **n** elements is **n-1** operations.