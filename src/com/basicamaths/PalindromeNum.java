package com.basicamaths;
import java.util.*;

public class PalindromeNum {
    public static int revNum(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        if (n == revNum(n)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }
}
