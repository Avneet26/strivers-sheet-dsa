package com.patterns;
import java.util.Scanner;

public class Pattern22 {
    // 3 3 3 3 3
    // 3 2 2 2 3
    // 3 2 1 2 3
    // 3 2 2 2 3
    // 3 3 3 3 3

    public static void pattern(int n) {
        int val = n;
        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                System.out.print(val +"\t");
                if(j != (2 * n) - 2 && i < n){
                    if(j < i && j < n - 1) {
                        val--;
                    } else if (j >= ((2*n)-2-i) && j >= n - 1) {
                        val++;
                    }
                } else if (j != (2 * n) - 2 && i >= n) {
                    if(j < n - 1 && j < ((2*n)-2-i)) {
                        val--;
                    } else if (j >= n - 1 && j >= i) {
                        val++;
                    }
                }
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }
}
