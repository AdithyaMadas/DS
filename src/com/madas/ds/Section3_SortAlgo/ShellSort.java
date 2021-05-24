package com.madas.ds.Section3_SortAlgo;

public class ShellSort {

    /*
     *
     * Shell sort is a variation of insertion sort algorithm, a little more advanced but. In InsertionSort we use a gap of one, i.e.
     *   we compared elements next to each other, their neighbours and then shifted each element accordingly. This led to many elements shifting. Consider
     *   if the smallest number is in the rightmost position of the array, then we had to shift all the element one position to the right and then we
     *   inserted smallest number to the left. This is not very efficient.
     *
     * Shell sort does some preliminary work before applying insertion sort you could say. Instead of using a gap value of one, we use higher gap values at first,
     *   thereby moving numbers more positions at once, it doesn't sort fully, but helps in setting up the array for insertion sort, hence improving performance.
     *
     * So the shell sort starts with a larger gap value than 1, and then reduces on every iteration, last iteration having value 1.
     *
     * There are many different ways to choose the starting gap of shell sort. Example: Knuth's Formula
     *
     *
     * In this implementation, we'll set gap to array.length/2
     *
     *  Example: {20, 35, -15, 7, 55, 1, -22}
     *
     *  Just like insertion sort, we consider the first element as sorted:
     *  Array length is 7, so 7/2 let's use a gap of 3.
     *
     *      First iteration explanation: {20, 35, -15, 7, 55, 1, -22}
     *          Let's consider i as 0, j as 0+gap = 3
     *          Comparing index 0 and 3, (20 and 7) we swap 7 and 20. So after 1 pass => {7, 35, -15, 20, 55, 1, -22}
     *          2nd pass: i=1; j=1+3=4
     *          Comparing index 1 and 4, (35 and 55), no need to swap. So after 2 pass => {7, 35, -15, 20, 55, 1, -22}
     *          3rd pass: i=2; j=2+3=5
     *          Comparing index 2 and 5, (-15 and 1), no need to swap. So after 3 pass => {7, 35, -15, 20, 55, 1, -22}
     *          3rd pass: i=3; j=3+3=6
     *          Comparing index 3 and 6, (20 and -22),we swap 20 and -22. So after 4 pass => {7, 35, -15, -22, 55, 1, 20}
     *          It's not done there. Comparing index 0 and 6 (7 and -22). We swap them. So after 4 pass => {-22, 35, -15, 7, 55, 1, 20}
     *
     *      LINK: https://www.youtube.com/watch?v=9crZRd8GPWM&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF
     *
     *  Properties:
     *      * In-place algo
     *      * O(n²) worst case, but generally performs much better
     *      * Unstable sort algo
     *
     * */
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        shellSort(arr);

        for (int i : arr) {
            System.out.printf(i + " ");
        }

    }


    public static void shellSort(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }


    }
}
