package Dynamic_Programming.O_1_Knapsack_probelm;
/*
public class Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {

        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

        }
        if(sum%2 !=0){
            return false;
        }else {
            return helper(nums,sum/2);
        }
    }
    private boolean helper(int[] nums, int target) {
        int n = nums.length;

        // Create a DP array to store the possibility of each sum
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;  // We can always form sum 0 by choosing no elements

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];  // Return whether target sum is achievable
    }



}


 */

