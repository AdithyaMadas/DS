package com.madas.ds.Section3_SortAlgo;

public class StableCountingSort {

    /*
     *
     * Stable counting sort, similar to normal counting sort, we keep a count array. But after getting the count array we male it a cumulative array.
     *
     *   For array: {2,5,7,3,2,5,7,8,9,4,5}
     * Count array: {0,2,1,1,3,0,2,1,1,0}, after getting the count array, we make it cumulative by adding the elements.
     * Cumulative count array: {0,2,3,4,7,7,9,10,11,11}
     *
     *   Using this cumulative array, we can stable sort. For doing so, we traverse the array of elements backward, and insert into a temp array.
     *   For element 5: We see what is the number at index 4 (5-1) in the cumulative array (we also decrement 1 from cumulative array), the number is 7. So we insert element into index 6(7-1) in the temp array.
     *       {0,2,3,4,6,7,9,10,11,11}
     *       {☐,☐,☐,☐,☐,☐,5,☐,☐,☐,☐}
     *
     *  https://www.youtube.com/watch?v=7zuGmKfUt7s&ab_channel=GeeksforGeeks
     *
     *  In the video, during filling to the temp array, the looked at elements from left to right, if we traverse elements from right to left, it makes it stable sort.
     *
     *
     * */

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 3, 2, 5, 7, 8, 9, 4, 5};

        countingSort(arr, 0, 10);

        for (int i : arr) {
            System.out.printf(" " + i);
        }
    }

    public static void countingSort(int[] arr, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i : arr) {
            countArray[i - min]++;
        }
        //Make it cumulative
        for (int j = 1; j < countArray.length; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] tempArray = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            tempArray[--countArray[arr[i]]] = arr[i];
        }

        System.arraycopy(tempArray, 0, arr, 0, arr.length);
    }
}
