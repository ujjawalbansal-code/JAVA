package com.program1;

import java.util.Scanner;

public class ReverseNum {
    static void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while(num>0){
            int t = num%10;
            ans=ans*10+t;
            num /= 10;
        }
        System.out.println(ans);
    }
}
