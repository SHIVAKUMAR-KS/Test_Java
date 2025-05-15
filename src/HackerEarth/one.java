package HackerEarth;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class one {

    // Helper function to check if a given capacity can ship the packages in N days
    public static boolean canShip(int[] Arr, int N, int capacity) {
        int daysRequired = 1;  // Start with the first day
        int currentWeight = 0;

        // Loop through each package and try to load it
        for (int i = 0; i < Arr.length; i++) {
            // If adding this package exceeds the capacity, we start a new day
            if (currentWeight + Arr[i] > capacity) {
                daysRequired++;
                currentWeight = Arr[i];
                // If we need more than N days, return false
                if (daysRequired > N) {
                    return false;
                }
            } else {
                currentWeight += Arr[i];
            }
        }
        return true;
    }

    // Function to find the minimum capacity using binary search
    public static int minimumCapacity(int[] Arr, int N) {
        int low = 0;
        int high = 0;
        for (int weight : Arr) {
            low = Math.max(low, weight);  // At least the maximum weight of a single package
            high += weight;  // Maximum possible capacity (sum of all weights)
        }

        // Binary search for the least capacity
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShip(Arr, N, mid)) {
                high = mid;  // Try for a smaller capacity
            } else {
                low = mid + 1;  // Increase capacity
            }
        }

        return low;  // low will be the minimum capacity
    }

    public static void main(String[] args) throws IOException {
        // Using BufferedReader for fast input handling
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        // Read the number of test cases
        System.out.print("Enter number of test cases: ");
        int T = Integer.parseInt(reader.readLine());

        // Process each test case
        for (int t = 0; t < T; t++) {
            //System.out.println("Test case " + (t + 1) + ":");

            // Read the size of the array (number of packages)
            System.out.print("Enter the number of packages: ");
            int n = Integer.parseInt(reader.readLine());

            // Read the array of package weights
            System.out.print("Enter the package weights: ");
            tokenizer = new StringTokenizer(reader.readLine());
            int[] Arr = new int[n];
            for (int i = 0; i < n; i++) {
                Arr[i] = Integer.parseInt(tokenizer.nextToken());
            }

            // Read the number of days
            System.out.print("Enter the number of days: ");
            int N = Integer.parseInt(reader.readLine());

            // Call the minimumCapacity function to get the result
            int result = minimumCapacity(Arr, N);
            System.out.println("Minimum capacity required: " + result);
        }

        // Close the reader
        reader.close();
    }
}
