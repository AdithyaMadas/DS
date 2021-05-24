package com.madas.ds.Section3_SortAlgo;

public class MergeSort {

    /*
     *
     * Merge sort works on the concept of divide and conquer, it splits the array into 2 parts down the middle and keeps doing so until there are
     *  only single elements in the array. On merging back the split sub arrays it is merged in the sorted order.
     *
     *  Example: {20 , 35, -15, 7, 55, 1, -22}
     *                      /\
     *           {20, 35, 15}   {7, 55, 1, -22}
     *             /\                    /\
     *       {20}   {35, 15}    {7, 55}     {1, -22}
     *                  /\          /\          /\
     *              {35}  {15}    {7}  {55}    {1}  {-22}
     *                 \/            \/           \/
     *              {15, 35}        {7, 55}      {-22, 1}
     *          \/                          \/
     *      {15, 20, 35}              {-22, 1, 7, 55}
     *                      \/
     *          {-22, 1, 7, 15, 20, 35, 55}
     *
     *      Note: First the left subtree is sorted, then the right subtree is sorted.
     *
     *  Properties:
     *      * Not an in-place algo
     *      * O(n log n)
     *      * Stable algo
     *
     * */

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
        if (arr[mid - 1] <= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i < mid) {
            tempArray[tempIndex++] = arr[i++];
        }

        while (j < end) {
            tempArray[tempIndex++] = arr[j++];
        }

//        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, arr, start, tempIndex);
    }
}
