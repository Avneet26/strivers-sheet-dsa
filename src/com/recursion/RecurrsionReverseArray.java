package com.recursion;

import java.util.Scanner;

public class RecurrsionReverseArray {

    public static void reverse(int[] arr, int n, int x) {
        if (x < n / 2) {
            System.out.println(x + " " + ((n - 1) - x));
            int temp = arr[x];
            arr[x] = arr[(n-1) - x];
            arr[(n-1) - x] = temp;
            reverse(arr, n, x + 1);
        } else {
            for(int i : arr) {
                System.out.print(i + "\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i: arr) {
            System.out.print(i + "\t");
        }

        reverse(arr, n, 0);
    }
}
