package com.madas.ds.Section7_HashTables;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    /*
    * Bucket sort is similar to counting sort. It uses a hash function to separate all the values into different buckets, and then while merging it back it sorts the values
    *  back into the correct order. The separation of all the values is done by a hashing function. And while hashing we need to ensure that, the lower values go before the
    *  higher values in the array. i.e, if comparing 47, 69, then we need to make sure that the hashing function puts 47 before 69 in the array.
    *
    * Properties:
    *  * Not in place
    *  * Can be stable depending on the sort algorithm used to sort sub arrays.
    *  * O(n) because it makes assumptions about the size of the elements.
    *
    * */
    public static void main(String[] args) {
        int[] arr = {47, 43, 55, 12, 99, 25};

        bucketSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bucketSort(int[] arr) {
        List<Integer>[] bucket = new List[10];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList();
        }

        for (int i : arr) {
            bucket[hash(i)].add(i);
        }

        for (List i : bucket) {
            Collections.sort(i);
        }
        int j = 0;
        for (List<Integer> i : bucket) {
            for (int q : i) {
                arr[j++] = q;
            }
        }
    }

    public static int hash(int i) {
        return (int) i / 10;
    }
}
