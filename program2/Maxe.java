package com.program2;

public class Maxe {
    static void main() {
        int[] arr ={1,340,23,45,78};
        System.out.println(maxf(arr));
        System.out.println(maxRange(arr,2,4));
    }

    //max range
    //work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end>start){
            return -1;
        }
        if (arr == null){
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
//  imagine that array is not empty
    static int maxf(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr [i];
            }
        }
        return maxVal;
    }
}
