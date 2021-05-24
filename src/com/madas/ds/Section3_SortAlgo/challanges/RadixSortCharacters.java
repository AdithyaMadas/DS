package com.madas.ds.Section3_SortAlgo.challanges;

public class RadixSortCharacters {
    public static void main(String[] args) {
        String[] arr = {"bcdef", "dbqac", "abcde", "omadd", "bbbbb"};
        radixSort(arr, 5, 26);
        for (String x : arr) {
            System.out.printf(x + " ");
        }

    }
    public static void radixSort(String[] arr, int width, int radix) {
        for (int i = width-1; i >= 0; i--) {
            radixSingleSort(arr, i, radix);
        }
    }

    public static void radixSingleSort(String[] arr, int position, int radix) {
        int[] countingArray = new int[radix];

        for (String i : arr) {
            countingArray[getDigit(i, position)]++;
        }
        makeCumulative(countingArray);

        String[] tempArray = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            tempArray[--countingArray[getDigit(arr[i], position)]] = arr[i];
        }

        System.arraycopy(tempArray, 0, arr, 0, arr.length);
    }

    public static int getDigit(String element, int position) {
        return element.charAt(position) - 'a';
    }

    public static void makeCumulative(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            arr[j] += arr[j - 1];
        }
    }
}

