package com.example.algorithm_java.sorting;

public class BubbleSort {
    private BubbleSort() {}

    public static void sort(int[] a, int n) {
        int x, j, temp, swaps;

        for (x = n - 2; x >= 0; x--) {

            swaps = 0;
            for (j = 0; j <= x; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }
}
