package com.madas.ds.Section3_SortAlgo;

public class BubbleSortWithGap {

    /*
     *
     * Bubble sort but with gap logic like shell sort
     *
     * */

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        bubbleSortWithGap(arr);
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }

    public static void bubbleSortWithGap(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j >= gap && arr[j - gap] > arr[j]) {
                    swap(arr, j - gap, j);
                    j -= gap;
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
