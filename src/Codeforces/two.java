package Codeforces;


import java.util.*;
public class two {
    public static void helper(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[][] grid = new int[n][m];

            if (k > Math.max(n, m)) {
                // Fill row-wise with wraparound
                int num = 1;
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < m; ++j) {
                        grid[i][j] = num;
                        num = num % k + 1;
                    }
                }
            } else if (k <= m && m % k != 0) {
                // Row-wise fill for invalid column division
                int num = 1;
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < m; ++j) {
                        grid[i][j] = num;
                        num = num % k + 1;
                    }
                }
            } else if (k <= n && n % k != 0) {
                // Column-wise fill for invalid row division
                int num = 1;
                for (int j = 0; j < m; ++j) {
                    for (int i = 0; i < n; ++i) {
                        grid[i][j] = num;
                        num = num % k + 1;
                    }
                }
            } else {
                //  here we do shifted pattern
                if (k <= m) {
                    for (int i = 0; i < n; ++i) {
                        int shift = i % k;
                        for (int j = 0; j < m; ++j) {
                            grid[i][j] = (shift + j) % k + 1;
                        }
                    }
                } else {
                    for (int j = 0; j < m; ++j) {
                        int shift = j % k;
                        for (int i = 0; i < n; ++i) {
                            grid[i][j] = (shift + i) % k + 1;
                        }
                    }
                }
            }


            for (int[] row : grid) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        helper(sc);

    }
}
