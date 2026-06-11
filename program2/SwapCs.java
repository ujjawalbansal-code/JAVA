package com.program2;

import java.util.Arrays;

public class SwapCs {
    static void main() {
        int[] arr = {1,3,23,9,18,44};
//        swapc(arr,1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            //swap
            swapc(arr,start,end);
            start++;
            end--;
        }
    }

    static void swapc(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
