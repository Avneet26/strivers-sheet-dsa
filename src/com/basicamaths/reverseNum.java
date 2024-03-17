package com.basicamaths;

import java.util.Scanner;

public class reverseNum {
    // Given a number N reverse the number and print it.

    public static int revNum(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(revNum(n));
    }
}
