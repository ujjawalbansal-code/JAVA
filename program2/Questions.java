package com.program2;

import java.util.Scanner;

public class Questions {
    static void main() {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);

//        boolean answ = isArmstrong(n);
//        System.out.println(answ);

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
         while (n > 0){
             int rem = n%10;
             n = n / 10;
             sum = sum + rem*rem*rem;
         }

        return sum == original;
    }


    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }


}
