package DESI_QNA;

public class main {


    public static int helper(int[] no_adjacent, int[] one_adjacent, int[] both_adjacent) {
        int n = no_adjacent.length;
        int[][] dp = new int[n][4];


        dp[0][0] = both_adjacent[0];
        dp[0][1] = one_adjacent[0];
        dp[0][2] = one_adjacent[0];
        dp[0][3] = no_adjacent[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][3]) + both_adjacent[i];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + one_adjacent[i];
            dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + one_adjacent[i];
            dp[i][3] = Math.max(dp[i - 1][0], dp[i - 1][2]) + no_adjacent[i];
        }

        return Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]),
                Math.max(dp[n - 1][2], dp[n - 1][3]));
    }

    public static void main(String[] args) {
        int[] no_adjacent = {2, 1, 3};
        int[] one_adjacent = {4, 2, 1};
        int[] both_adjacent = {1, 2, 3};

        System.out.println(helper(no_adjacent, one_adjacent, both_adjacent));
    }
}
