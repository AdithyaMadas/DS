package com.madas.ds.Section3_SortAlgo;

public class RadixSort {

    /*
     *
     * Radix sort also makes assumptions of the data. Data must have the same width, index, for example, all should be decimal digits and can have 4 digits in them.
     *   Else all are hexadecimal, have 3 digits width in them.
     *   Data can only be integers or strings.
     *   It sorts based on each individual digit or letter position, starts at the rightmost place, when the sorting logic is used, it should be stable sort
     *
     *   Say we have an array of 4 decimal digits: {472|5|, 458|6|, 133|0|, 879|2|, 159|4|, 572|9|}
     *      First we only consider the rightmost digit, the ones place and sort them accordingly.
     *   So the sorted array is: {1330, 8792, 1594, 4725, 4586, 5729}
     *      Now we sort the above array based on tens place: {13|3|0, 87|9|2, 15|9|4, 47|2|5, 45|8|6, 57|2|9}
     *   So the sorted array is: {4725, 5729, 1330, 4586, 8792, 1594}
     *      Now we sort the above array based on hundreds place: {4|7|25, 5|7|29, 1|3|30, 4|5|86, 8|7|92, 1|5|94}
     *   So the sorted array is: {1330, 4586, 1594, 4725, 5729, 8792}
     *  Now we sort the above array based on thousand's place: {|1|330, |4|586, |1|594, |4|725, |5|729, |8|792}
     *   So the sorted array is: {1330, 1594, 4586, 4725, 5729, 8792}
     *
     *  You can see why the sorting algo has to be stable. So radix sort basically sorts digit by digit, from right to left.
     *
     *  Properties:
     *      * Counting sort is often used as the sorting algo.
     *      * O(n) - can be achieved, however generally runs slower than O(n log n) algorithms, due to overhead involved.
     *      * In-place, depends on which sorting algo you use.
     *      * Stable algo.
     *
     * */
    public static void main(String[] args) {
        int arr[] = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(arr, 4, 10);

        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }

    public static void radixSort(int[] arr, int width, int radix) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(arr, i, radix);
        }
    }

    public static void radixSingleSort(int[] arr, int position, int radix) {
        int[] countingArray = new int[radix];

        for (int i : arr) {
            countingArray[getDigit(i, position, radix)]++;
        }
        makeCumulative(countingArray);

        int[] tempArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            tempArray[--countingArray[getDigit(arr[i], position, radix)]] = arr[i];
        }

        System.arraycopy(tempArray, 0, arr, 0, arr.length);
    }

    public static int getDigit(int element, int position, int radix) {
        return (int) ((element / Math.pow(radix, position)) % radix);
    }

    public static void makeCumulative(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            arr[j] += arr[j - 1];
        }
    }
}
