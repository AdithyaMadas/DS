package com.madas.ds.Section3_SortAlgo;

public class CountingSort {

    /*
     *
     * Counting Sort is a sorting algorithm which sorts in O(n) time complexity. It does so by making some assumptions about the data. It doesn't even compare elements
     *   against each other to sort the elements, what it does instead it counts the occurrences of each value. It works with only non-negative, discrete(not related to each other) values.
     *
     *  Values must be of a specific range, say from 1-10. We keep count the number of times the element occurs in a separate array.
     *
     *  Say we know that the values of the array are from 1-10 inclusive. We make a 10 element array, each index count of an element each. index 0, counts occurrences of 1, index 1 counts occurrences 2, so on.
     *
     *  Example: {2,5,7,3,2,5,7,8,9,4,5}
     *
     *  We traverse through the array to be sorted:
     *  First element is 2 so, we increment index 1 (2-1) in counting array: {0,1,0,0,0,0,0,0,0,0}
     *  Next element is 5 so, we increment index 4 (5-1) in counting array: {0,1,0,0,1,0,0,0,0,0}
     *  Next element is 7 so, we increment index 6 (7-1) in counting array: {0,1,0,0,1,0,1,0,0,0}
     *  Next element is 3 so, we increment index 2 (3-1) in counting array: {0,1,1,0,1,0,1,0,0,0}
     *  Next element is 2 so, we increment index 1 (2-1) in counting array: {0,2,1,0,1,0,1,0,0,0}
     *  Next element is 5 so, we increment index 4 (5-1) in counting array: {0,2,1,0,2,0,1,0,0,0}
     *  Next element is 7 so, we increment index 6 (7-1) in counting array: {0,2,1,0,2,0,2,0,0,0}
     *  Next element is 8 so, we increment index 7 (8-1) in counting array: {0,2,1,0,2,0,2,1,0,0}
     *  Next element is 9 so, we increment index 8 (9-1) in counting array: {0,2,1,0,2,0,2,1,1,0}
     *  Next element is 4 so, we increment index 3 (4-1) in counting array: {0,2,1,1,2,0,2,1,1,0}
     *  Next element is 5 so, we increment index 4 (5-1) in counting array: {0,2,1,1,3,0,2,1,1,0}
     *
     * Based on the counting array, we know how many times the elements occurred, just put the back into the original array and return it.
     *
     *  Sorted Array: {2,2,3,4,5,5,5,7,7,8,9}
     *
     * Ideally, when we make an assumption the length of the array should be equal to the range of numbers.
     *
     * Properties:
     *  * Not in place algorithm
     *  * O(n) - can be achieved, because of assumptions.
     *  * If we want it to be stable, need to do some extra steps, the implementation below is not stable.
     *
     *
     * */

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 2, 5, 7, 8, 9, 4, 5};

        countingSort(arr, 0, 10);

        for (int i : arr) {
            System.out.printf(" " + i);
        }
    }

    public static void countingSort(int[] arr, int min, int max) {

        int[] countingArray = new int[(max - min) + 1];

        for (int i : arr) {
            countingArray[(i - min)]++;
        }

        int index = 0;
        for (int i = min; i < (max - min) + 1; i++) {
            for (int j = 0; j < countingArray[i]; j++) {
                arr[index++] = i;
            }
        }
    }
}
