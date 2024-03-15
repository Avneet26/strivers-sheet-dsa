package com.patterns;

import java.util.Scanner;

public class Pattern17 {
    //   A
    //  ABA
    // ABCBA

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int spaces = n - 1;

        for (int i = 0; i < n; i++) {
            char alpha = 'A';

            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                System.out.print(alpha + "\t");
                if (st < (stars/2)){
                    alpha++;
                } else {
                    alpha--;
                }
            }
            System.out.println("");
            spaces--;
            stars += 2;
        }
    }
}
