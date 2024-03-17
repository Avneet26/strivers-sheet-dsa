package com.basicamaths;
import java.util.Scanner;

public class countDigits {
    // Given an integer N, write a program to count the number of digits in N.

    public static int digitsNo(int n) {
        int count = 0;

        // Time complexity O(n)
        while (n!=0) {
            n /= 10;
            count++;
        }

        // Time complexity O(1)
        count  = (int)Math.floor(Math.log10(n) + 1);

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitsNo(n));
    }
}
