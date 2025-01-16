package Dynamic_Programming.O_1_Knapsack_probelm;

public class Subset_Sum {
    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int n = arr.length;

        // Create a DP array to store the possibility of each sum
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;  // We can always form sum 0 by choosing no elements

        for (int num : arr) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }
}
