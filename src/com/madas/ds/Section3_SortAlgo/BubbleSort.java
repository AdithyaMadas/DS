package com.madas.ds.Section3_SortAlgo;

public class BubbleSort {

    /*
    *
    * Bubble sort is one the most basic sort algorithms, it maintains 2 parts of the array, sorted and unsorted part.
    * On each iteration, it pushes the largest number to the end of the unsorted part, hence making it sorted.
    *
    * The | splits the sorted, unsorted part
    *
    * For eg: {-22, 35, 12, 44, 9|}
    *          After 1 iteration: {-22, 12, 35, 9|, 44}
    *          After 2 iterations: {-22, 12, 9|, 35, 44}
    *          After 3 iterations: {-22, 9|, 12, 35, 44}
    *          After 4 iterations: {-22|, 9, 12, 35, 44}
    *          After 5 iterations: {|-22, 9, 12, 35, 44}
    *
    *   So for every iteration it starts from 0 index, goes all the way to the end of the unsorted index. If the number at i is greater then the number at i+1
    *       then it swaps both the numbers, in doing so pushing the largest number of the unsorted part to the end.
    *
    *      Properties:
    *           * In place algo (Means that it doesn't take any extra space)
    *           * O(n²) time complexity
    *           * Stable sort algorithm (maintains ordering even after sort), means say there are 2 9s in the array, after sorting the 9 with a lower index will have
    *               a lower index even after sorting.
    *
    * */


    public static void main(String[] args) {
        int[] arr = {-22, 12, 35, 9, 44};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }

    //If required you can add a numberOfSwaps variable, to keep track of the number of swaps that took place in that iteration. If no swaps took place, then the
    //array is already sorted, you can break out of the loops.
    public static void bubbleSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
