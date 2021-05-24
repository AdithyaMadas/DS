package com.madas.ds.Section3_SortAlgo;

public class SelectionSort {

    /*
    *
    * Selection Sort maintains 2 parts of the array, sorted part and an unsorted part.
    * It traverses through the entire unsorted array and picks the index of the largest number in the array.
    * It then swaps the largest number and the last number in unsorted array part. In doing so pushing the largest number to the end.
    * It is similar to Bubble sort, but generally performs a little better, because only swaps elements once every iteration.
    *
    * The | splits the sorted, unsorted part
    *
    * For eg: {-22, 35, 12, 44, 9|}
    *   Iteration 1: {-22, 35, 12, 9,| 44} It traversed through the unsorted part found that 44 is largest element swapped the largest with the end, hence sorting it.
    *   Iteration 2: {-22, 9, 12,| 35, 44}
    *   Iteration 3: {-22, 9,| 12, 35, 44}
    *   Iteration 4: {-22,| 9, 12, 35, 44}
    *   Iteration 5: {|-22, 9, 12, 35, 44}
    *
    *   Properties:
    *       * In-place algo
    *       * O(n²) time complexity
    *       * Not a stable sort by design, can be made stable though
    *
    * */

    public static void main(String[] args) {
        int[] arr = {-22, 35, 12, 44, 9};

        selectionSort(arr);

        for (int i : arr) {
            System.out.printf(i+" ");
        }

    }

    public static void selectionSort(int[] arr) {
        for (int lastSortedIndex = arr.length-1; lastSortedIndex > 0; lastSortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastSortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastSortedIndex);
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
