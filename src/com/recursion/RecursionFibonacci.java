package com.recursion;

import java.util.Scanner;

public class RecursionFibonacci {

    public static void printFibonacci(int ui, int n1, int n2, int x) {
        if (x == 0) {
            System.out.print(n1 + "\t");
        }
        if (x < ui) {
            n1 += n2;
            System.out.print(n2 + "\t");
            printFibonacci(ui, n2, n1, x + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFibonacci(n, 0, 1, 0);
    }
}
