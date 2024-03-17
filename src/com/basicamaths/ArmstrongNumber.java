package com.basicamaths;

import java.util.Scanner;

public class ArmstrongNumber {
    //    Input:153
    //    Output: Yes, it is an Armstrong Number
    //    Explanation: 1^3 + 5^3 + 3^3 = 153

    public static boolean isPalindrome(int n) {
        int dummy = n;
        int num = 0;
        int len = (int)Math.floor(Math.log10(n) + 1);

        while(n != 0) {
            int digit = n % 10;
            num = num + (int)Math.pow(digit, len);
            n /= 10;
        }

        return num == dummy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}
