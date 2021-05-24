package com.madas.ds.Section3_SortAlgo.challanges;

import java.util.Arrays;

public class InsertionSortRecursive {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(arr, arr.length);

        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }

    private static void insertionSort(int[] arr, int sortedIndex) {
        if (sortedIndex < 2) {
            return;
        }

        insertionSort(arr, sortedIndex - 1);

        int element = arr[sortedIndex - 1];
        int i;
        for (i = sortedIndex - 1; i > 0 && arr[i - 1] > element; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = element;
    }

}


