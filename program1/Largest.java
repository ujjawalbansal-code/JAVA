package com.program1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        1st method by assuming
        int max = a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);

//        2nd method by math module
//        int max = Math.max(c,Math.max(a,b));
        max = Math.max(c,Math.max(a,b));

        System.out.println(max);
    }
}
