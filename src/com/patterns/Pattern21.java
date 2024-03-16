package com.patterns;
import java.util.Scanner;

public class Pattern21 {
    // ****
    // *  *
    // *  *
    // ****

    public static void pattern(int n) {
        int stars = n;
        int spaces = 0;

        for (int i = 1; i <= n; i++) {
            for (int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            for (int sp = 0; sp < spaces; sp++) {
                System.out.print("\t");
            }
            if (i != 1 && i != n) {
                for (int st = 0; st < stars; st++) {
                    System.out.print("*\t");
                }
            }
            System.out.println("");
            if (i == (n - 1)) {
                stars = n;
                spaces = 0;
            } else {
                stars = 1;
                spaces = (n - 2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }
}
