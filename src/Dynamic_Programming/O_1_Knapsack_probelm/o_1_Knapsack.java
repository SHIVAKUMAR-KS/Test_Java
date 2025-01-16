package Dynamic_Programming.O_1_Knapsack_probelm;

public class o_1_Knapsack {
    class Solution {
        // Function to return max value that can be put in knapsack of capacity.
        static int knapSack(int capacity, int val[], int wt[]) {
            // code here
            int n = val.length;

            // DP table to store the results of subproblems
            int dp[][] = new int[n + 1][capacity + 1];

            // Initialize the dp table with -1 (for memoization)
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= capacity; j++) {
                    dp[i][j] = -1;
                }
            }

            return knapSackUtil(n, capacity, val, wt, dp);
        }
        static int knapSackUtil(int n, int w, int val[], int wt[], int dp[][]) {
            // Base case: if no items or capacity is 0, return 0
            if (n == 0 || w == 0) {
                return 0;
            }

            // If the result is already computed, return it from the dp table
            if (dp[n][w] != -1) {
                return dp[n][w];
            }

            // If the weight of the current item is less than or equal to the capacity
            if (wt[n - 1] <= w) {
                // Take the maximum of including or excluding the current item
                dp[n][w] = Math.max(val[n - 1] + knapSackUtil(n - 1, w - wt[n - 1], val, wt, dp),
                        knapSackUtil(n - 1, w, val, wt, dp));
            } else {
                // Exclude the current item
                dp[n][w] = knapSackUtil(n - 1, w, val, wt, dp);
            }

            // Return the computed result
            return dp[n][w];
        }
    }

}
