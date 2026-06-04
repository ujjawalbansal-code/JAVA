package com.program1;

import java.util.Scanner;

public class CaseCheck {
    static void main() {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        trim is used to delete extra space
        if (ch>= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }
    }
}
