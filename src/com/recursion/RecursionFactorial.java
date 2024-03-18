package com.recursion;

import java.util.Scanner;

public class RecursionFactorial {

    public static int factorial(int n, int fact) {
        if(n >= 1) {
            return n * factorial(n - 1 , fact);
        } else {
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n, 1));
    }
}
