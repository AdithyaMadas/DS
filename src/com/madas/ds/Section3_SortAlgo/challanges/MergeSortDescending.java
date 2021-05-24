package com.madas.ds.Section3_SortAlgo.challanges;

import java.math.BigInteger;

public class MergeSortDescending {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(arr, 0, arr.length);

        for (int i : arr) {
            System.out.printf(" " + i);
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] >= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int index = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            if (arr[i] >= arr[j]) {
                temp[index++] = arr[i++];
            } else if (arr[i] < arr[j]) {
                temp[index++] = arr[j++];
            }

            while (i < mid) {
                temp[index++] = arr[i++];
            }

            while (j < end) {
                temp[index++] = arr[j++];
            }

            System.arraycopy(temp, 0, arr, start, index);

        }
    }
}
