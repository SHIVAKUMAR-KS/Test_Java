package Juspay;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        // This is the trick: for each i, we record (p[i] - i)
        for (int i = 0; i < n; i++) {
            int key = p[i] - i;
            map.put(key, map.getOrDefault(key, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(key));
        }

        System.out.println(maxFreq);
    }
}
