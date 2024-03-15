package com.patterns;

import java.util.Scanner;

public class Pattern5 {
    // ***
    // **
    // *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = n;
        int spaces = 0;

        for (int i = 1; i <= n; i++) {
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            System.out.println("");
            stars--;
            spaces++;
        }
    }
}
