package com.madas.ds.Section8_SearchAlgorithms;

public class BinarySearch {
    /*
    * Time complexity O(log n)
    * */

    public static void main(String[] args) {
        int[] arr = {-22, -15, 1, 20, 26, 89};

        System.out.println(iterativeSearch(arr, 1));
        System.out.println(iterativeSearch(arr, -22));
        System.out.println(iterativeSearch(arr, 8888));
        System.out.println(iterativeSearch(arr, 89));

    }

    public static int iterativeSearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
