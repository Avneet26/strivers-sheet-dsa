package com.hashmaps;

import java.util.HashMap;

public class HashmapExamples {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (String key : map.keySet()) {
            System.out.println("key: " + key + ": Value: " + map.get(key));
        }
    }
}
