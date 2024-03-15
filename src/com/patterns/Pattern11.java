package com.patterns;

import java.util.Scanner;

public class Pattern11 {
    // 1
    // 01
    // 101
    // 0101

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int val = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print(val + "\t");
                if (val == 0) {
                    val = 1;
                } else {
                    val = 0;
                }
            }
            System.out.println("");
            stars++;
            if (i % 2 != 0) {
                val = 1;
            } else {
                val = 0;
            }
        }
    }
}
