package com.madas.ds.Section3_SortAlgo;

import java.util.Arrays;

public class JDKSort {

    /*
    * We don't need to implement sort algorithms always, we can use the Arrays sort algorithm.
    * */

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        /*Read documentation for more info. Normal sort is a dual pivot quick sort, parallel sort is a hybrid sort, divides the array into sub arrays, when
         reaches minimum granularity, it calls dual pivot quick sort, and merges, it also does it on parallel threads.
         Read java docs for more info.
        */
        Arrays.sort(arr);

//        Arrays.parallelSort(arr);

        for (int i : arr) {
            System.out.printf(i + " ");
        }

    }
}
