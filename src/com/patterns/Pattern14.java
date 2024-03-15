package com.patterns;
import java.util.Scanner;

public class Pattern14 {
    // A
    // AB
    // ABC

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;

        for (int i = 0; i < n; i++) {
            char alpha = 'A';
            for (int st = 0; st < stars; st++) {
                System.out.print(alpha + "\t");
                alpha++;
            }
            System.out.println("");
            stars++;
        }
    }
}
