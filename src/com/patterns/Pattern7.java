package com.patterns;
import java.util.Scanner;
public class Pattern7 {
    //   *
    //  ***
    // *****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int spaces = n - 1;

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
    }
}
