package com.recursion;

import java.util.Scanner;

public class RecursionSum {

    public static void sumN(int i, int n, int sum) {
        if(i <= n) {
            sum += i;
            sumN(i + 1, n, sum);
        } else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumN(1, n, 0);
    }
}
