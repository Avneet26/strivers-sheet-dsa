package com.patterns;

import java.util.Scanner;

public class Pattern12 {
    // 1      1
    // 12    21
    // 123  321
    // 12344321

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int space = 2 * (n - 1);

        for (int i = 0; i < n; i++) {
            int value = 1;
            for (int st = 0; st < stars; st++) {
                System.out.print(value + "\t");
                if (st != (stars - 1)) {
                    value++;
                }
            }
            for (int sp = 0; sp < space; sp++) {
                System.out.print("\t");
            }
            for (int st = 0; st < stars; st++) {
                System.out.print(value + "\t");
                value--;
            }
            System.out.println("");
            stars++;
            space -= 2;
        }

    }
}
