package com.madas.ds.Section3_SortAlgo;

public class InsertionSort {

    /*
     *
     * Insertion Sort maintains a sorted part and an unsorted part. It starts from the index 1, and the sorted part is the index 0. As there is only one element, is it
     * always sorted. It picks an element from the unsorted part and then inserts the same into the sorted part, while inserting it inserts into the correct position
     * as per the array. It inserts into the correct position by shifting the elements to the right.
     *
     * Left of | denotes sorted part
     *
     * For eg: {20 |, 35, -15, 7, 55, 1, -22}
     *      After 1 iteration: {20, 35 |, -15, 7, 55, 1, -22}
     *      After 2 iterations: {-15, 20, 35 |, 7, 55, 1, -22}
     *      After 3 iterations: {-15, 7, 20, 35 |, 55, 1, -22}
     *      After 4 iterations: {-15, 7, 20, 35, 55 |, 1, -22}
     *      After 5 iterations: {-15, 1, 7, 20, 35, 55 |, -22}
     *      After 6 iterations: {-22, -15, 1, 7, 20, 35, 55 |}
     *
     *
     *  Properties:
     *      * In-place algo
     *      * O(n²) time complexity
     *      * Stable sort algo
     *      * Runs in almost linear time, if array is almost sorted, because there's less shifting to do.
     *
     * */


    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(arr);

        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int firstSortedIndex = 1; firstSortedIndex < arr.length; firstSortedIndex++) {
            int newElement = arr[firstSortedIndex];

            int i;

            for (i = firstSortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }

            arr[i] = newElement;
        }
    }
}
