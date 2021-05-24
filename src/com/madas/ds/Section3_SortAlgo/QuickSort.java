package com.madas.ds.Section3_SortAlgo;

public class QuickSort {

    /*
     *
     * Quick sort also follows the divide and conquer approach. Quick sort works in a way such that, we choose a pivot element. We put the pivot element in such
     *   position that all the elements left to the pivot are less than the pivot element and all the elements to the right of it are greater than the pivot element.
     *   In doing so, the pivot element is in the correct position after sorting the array. Now we use the same logic and sort the sub-array left of the pivot and
     *   sort the sub-array right of the pivot.
     *
     * Example: {20 , 35, -15, 7, 55, 1, -22}
     *   Choose 20 as the pivot, assign i to index 0, j to index 6.
     *   Traverse j in such a way that it finds an element less than 20 (pivot). So -22 is less than pivot. Assign position -22 to position i.
     *   Array after assignment: {-22[i] , 35, -15, 7, 55, 1, -22[j] }
     *   Now traverse i in such a way that it finds an element greater than 20 (pivot). 35 (index 1) is greater than 20, so now assign 35 to index j.
     *   Array after assignment: {-22 , 35[i] , -15, 7, 55, 1, 35[j]}
     *   Traverse j in such a way that it finds an element less than 20 (pivot). So 1 is less than pivot. Assign position 1 to position i.
     *   Array after assignment: {-22 , 1[i] , -15, 7, 55, 1[j], 35}
     *   Now traverse i in such a way that it finds an element greater than 20 (pivot). 55 (index 4) is greater than 20, so now assign 55 to index j.
     *   Array after assignment: {-22 , 1 , -15, 7, 55[i], 55[j], 35}
     *   Now traverse j in such a way that it finds an element less than pivot, in doing so j goes to index 4, as index 4 is not greater than 4,
     *      i.e. j<i, we break out of the loop.
     *
     *   Assign the pivot element to index j.
     *      {-22 , 1 , -15, 7, 20, 55, 35}
     *      So now, the element 20 is in the sorted position, we do the same sorting for the left sub-array => {-22 , 1 , -15, 7} and right => {55, 35}
     *
     *  Properties:
     *      * In place algo
     *      * O (n log n)=> average time complexity, worst case is O(n²). Although it generally performs better than merge sort.
     *      * Not stable algo
     *
     * */
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        quickSort(arr, 0, arr.length);

        for (int i : arr) {
            System.out.printf(" " + i);
        }
    }


    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }


    public static int partition(int[] arr, int start, int end) {

        int pivotElement = arr[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && arr[--j] >= pivotElement) ;
            if (i < j) {
                arr[i] = arr[j];
            }

            while (i < j && arr[++i] <= pivotElement) ;
            if (i < j) {
                arr[j] = arr[i];
            }

        }
        arr[j] = pivotElement;
        return j;

    }


}
