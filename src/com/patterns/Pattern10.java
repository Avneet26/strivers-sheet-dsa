package com.patterns;
import java.util.Scanner;

public class Pattern10 {
    // *
    // **
    // ***
    // **
    // *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;

        for(int i = 0; i < (n * 2) - 1; i++) {
            for(int st = 0; st < stars; st++) {
                System.out.print("*\t");
            }
            System.out.println("");
            if(i < (n - 1)) {
                stars++;
            } else {
                stars--;
            }
        }
    }
}
