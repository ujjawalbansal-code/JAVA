package com.program2;

import java.util.Arrays;

public class ChangeValue {
    static void main() {
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] nums) {
        nums[0] = 99; //if you make a change to the object via this ref variable, same object will be change.

    }
}
