package com.patterns;

import java.util.Scanner;

public class Pattern9 {
    //    *
    //   ***
    //  *****
    //  *****
    //   ***
    //    *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of lines in half
        int stars = 1;
        int spaces = n - 1;

        //upper half
        for (int i = 0; i < n; i++) {
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            System.out.println("");
            spaces--;
            stars += 2;
        }

        stars = (n * 2) - 1;
        spaces = 0;

        //lower half
        for (int i = 0; i < n; i++) {
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            System.out.println("");
            spaces++;
            stars -= 2;
        }
    }
}
