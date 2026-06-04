package com.program1;

import java.util.Scanner;

public class CountNums {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value = in.nextInt();
        int count = 0;
        while (n>0){
            int t = n % 10;
            if (t==value){
                count++;
            }
            n=n/10;  // n/=10
        }
        System.out.println(count);
    }
}
