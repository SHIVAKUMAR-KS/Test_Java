package DESI_QNA.Hashing.SDE_Interview;
import java.util.*;
public class one {
    //Bruteforce
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int[] b = new int[n + 1];  // Initialize the array with size n + 1
//
//        // Input array
//        for (int i = 1; i <= n; i++) {
//            b[i] = sc.nextInt();
//        }
//
//        int c = 0;  // Count of valid subarrays
//
//        // Brute-force approach
//        for (int i = 1; i <= n; i++) {
//            int cx = 0, cy = 0;  // Counters for x and y
//
//            for (int j = i; j <= n; j++) {  // Iterate over subarrays
//                if (b[j] == x) {
//                    cx++;
//                }
//                if (b[j] == y) {
//                    cy++;
//                }
//                if (cx == cy) {
//                    c++;  // Found a valid subarray
//                }
//            }
//        }
//
//        System.out.println(c);  // Print the result
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt(); // Input x
        int y = sc.nextInt(); // Input y
        int[] b = new int[n];  // Array of size n

        // Input array and transform
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            b[i] = (temp == x) ? -1 : 1;  // Replace x with -1 and y with 1
        }

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();  // Map to store prefix sums and their counts
        prefixSumCount.put(0, 1);  // Initialize for subarrays that sum to 0 from the start
        int currentSum = 0;  // Current prefix sum
        int count = 0;  // Count of valid subarrays

        // Calculate the prefix sum and count the occurrences
        for (int i = 0; i < n; i++) {
            currentSum += b[i];  // Update the current sum
            count += prefixSumCount.getOrDefault(currentSum, 0);  // Add count of previous same prefix sums

            // Update the count of current prefix sum
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println(count);  // Print the result
    }
}
//Optimization :- Replace x = -1 and y = 1 -> now find the number of subarrays with sum = 0 using hashmap -> O(N) solved.
