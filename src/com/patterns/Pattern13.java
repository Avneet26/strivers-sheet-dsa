package com.patterns;

import java.util.Scanner;

public class Pattern13 {
    // 1
    // 23
    // 456

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            for (int st = 0; st < stars; st++) {
                System.out.print(value + "\t");
                value++;
            }
            System.out.println("");
            stars++;
        }

    }
}
