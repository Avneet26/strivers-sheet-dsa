package com.hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class MinMaxIRequency {
    public static void minMaxFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxKey = 0;
        int minKey = 0;

        for(int key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
            if(map.get(key) < min) {
                min = map.get(key);
                minKey = key;
            }
        }

        System.out.println("Max: " + maxKey);
        System.out.println("Min: " + minKey);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        minMaxFrequency(arr);
    }
}
