package com.patterns;

import java.util.Scanner;

public class Pattern18 {
    // C
    // BC
    // ABC

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        char alpha = (char)(int)('A' + (n - 1));

        for (int i = 2; i <= n + 1; i ++) {
            for (int j = 0; j < stars; j++) {
                System.out.print(alpha + "\t");
                alpha++;
            }
            System.out.println("");
            stars++;
            alpha -= i;
        }
    }
}
