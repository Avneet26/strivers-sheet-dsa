package com.patterns;

import java.util.Scanner;

public class Pattern16 {
    // A
    // BB
    // CCC

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        char alpha = 'A';

        for (int i = 0; i < n; i++) {
            for (int st = 0; st < stars; st++) {
                System.out.print(alpha + "\t");
            }
            System.out.println("");
            stars++;
            alpha++;
        }
    }
}
