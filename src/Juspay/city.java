package Juspay;


import java.util.*;

public class city {

    static int n;
    static char[][] grid = new char[2][];
    static boolean[][] visited;
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        // Example input
        n = 8;
        grid[0] = ".......x".toCharArray();
        grid[1] = ".x.xx...".toCharArray();

        System.out.println(countCriticalBlocks());
    }

    static int countCriticalBlocks() {
        int count = 0;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == '.') {
                    // Temporarily block it
                    grid[row][col] = 'x';
                    int components = countComponents();
                    if (components == 3) count++;
                    // Restore
                    grid[row][col] = '.';
                }
            }
        }

        return count;
    }

    static int countComponents() {
        visited = new boolean[2][n];
        int components = 0;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == '.' && !visited[row][col]) {
                    components++;
                    dfs(row, col);
                    if (components > 3) return components; // early break
                }
            }
        }

        return components;
    }

    static void dfs(int r, int c) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{r, c});
        visited[r][c] = true;

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int x = curr[0], y = curr[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx >= 0 && nx < 2 && ny >= 0 && ny < n) {
                    if (grid[nx][ny] == '.' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        stack.push(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
