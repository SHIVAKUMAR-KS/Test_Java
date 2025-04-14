package DESI_QNA.Hashing.Amazon_Sesssion;

import java.util.*;
public class minOprToDestroyArr {

    public static int minOprToDestroyArr(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int minOperations = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            if (freq == 1) {
                return -1;
            } else {

                minOperations += freq / 3 + (freq % 3 != 0 ? 1 : 0);
            }
        }
        return minOperations;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 1, 1, 8, 8, 10, 10};
        int minOps = minOprToDestroyArr(arr);
        if (minOps == -1) {
            System.out.println("it's not possible to destroy the array.");
        } else {
            System.out.println("Minimum number of operations to destroy the array: " + minOps);
        }
    }
}
