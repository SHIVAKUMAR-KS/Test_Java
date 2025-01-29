package Graph;
/*
public class Rotten_Orange {
}
/*
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>(); // for location
        int freshCount = 0;

        // Count fresh oranges and add rotten oranges to the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshCount++; // Count fresh oranges
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j}); // Add rotten oranges to the queue
                }
            }
        }

        // If no fresh oranges are present, return 0 immediately
        if (freshCount == 0) {
            return 0;
        }

        // BFS to propagate the rot
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rottenLoc = queue.poll();
                int row = rottenLoc[0];
                int col = rottenLoc[1];
                int[][] neighbours = {{row - 1, col}, {row, col + 1}, {row + 1, col}, {row, col - 1}};

                // Process each neighbouring cell
                for (int[] neighbour : neighbours) {
                    int nrow = neighbour[0];
                    int ncol = neighbour[1];

                    // Skip if out of bounds, already rotten, or empty space
                    if (nrow < 0 || nrow >= n || ncol < 0 || ncol >= m || grid[nrow][ncol] == 2 || grid[nrow][ncol] == 0) {
                        continue;
                    }

                    // Rot the fresh orange and add it to the queue
                    grid[nrow][ncol] = 2; // mark as rotten
                    queue.add(new int[]{nrow, ncol});
                    freshCount--; // decrease fresh orange count
                }
            }

            // If there are still fresh oranges, increment time
            if (!queue.isEmpty()) {
                time++;
            }
        }

        // If there are still fresh oranges left, return -1, otherwise return time
        return (freshCount == 0) ? time : -1;
    }
}

 */
