package com.recursion;

import java.util.Scanner;

public class PrintNTo1 {

    public static void printNum(int i) {
        if(i > 0) {
            System.out.println(i);
            printNum(i-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNum(n);
    }
}
