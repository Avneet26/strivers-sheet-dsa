package com.recursion;

import java.util.Scanner;

public class RecursionPalindrome {

    public static void isPalindrome(String s, int i, int j) {
        if (i < j && (s.charAt(i) == s.charAt(j))) {
            isPalindrome(s, i + 1, j - 1);
        } else if (i > j || i == j) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        isPalindrome(n, 0, n.length() - 1);
    }
}
