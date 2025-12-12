## Arrays Notes :tada: :rocket:
Arrays are fundamental data structure, that are contiguous and homogenous in nature , since they are **allocated in memory/RAM** , they are fast
also the operations like accessing , updating , printing elements are efficient in nature and have `O(1) complexity`.

## Drawbacks of arrays
- Arrays have finite/static size
- **Adding and Deleting** elements to the beginning and middle is not so much efficient.

## Resizable arrays
In case of Array list it maintains two key properties `size` and `capacity` , size is the number of elements present in the array list, whereas capacity is the
number of elements the list can contain, after the elements are full the list doubles the capacity.

## Declaration

```java
int[] arr = new int[10];
ArrayList<Integer> list = new ArrayList<>();
List<Integer> bulkList = Arrays.asList(1,2,34,5);
```