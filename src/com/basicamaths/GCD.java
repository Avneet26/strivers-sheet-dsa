package com.basicamaths;
import java.util.Scanner;

public class GCD {

    public static int gcd(int n1, int n2) {
        int minNum = Math.min(n1, n2);
        int gcdNum = 1;

        for (int i = 1; i <= minNum; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcdNum = i;
            }
        }

        return gcdNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(gcd(n1, n2));
    }
}
