package Being_Zero;

public class word_search {
    // Directions: Right, Left, Down, Up
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};

    // DFS method to search for the word in the board
    public static boolean dfs(int i, int j, int r, int c, char v[][], int index, String t) {
        if (index == t.length()) return true; // Word is completely found

        // Boundary conditions & character mismatch check
        if (i < 0 || i >= r || j < 0 || j >= c || v[i][j] != t.charAt(index)) return false;

        // Temporarily mark cell as visited
        char temp = v[i][j];
        v[i][j] = '#';

        // Explore all 4 possible directions
        for (int d = 0; d < 4; d++) {
            int newX = i + dx[d];
            int newY = j + dy[d];

            if (dfs(newX, newY, r, c, v, index + 1, t)) {
                v[i][j] = temp; // Restore character before returning
                return true;
            }
        }

        v[i][j] = temp; // Restore the original character
        return false;
    }

    // Main function to check if the word exists
    public boolean wordSearch(int r, int c, char[][] v, String t) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dfs(i, j, r, c, v, 0, t)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        word_search bz = new word_search();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(bz.wordSearch(3, 4, board, "ABCCED")); // Output: true (1)
        System.out.println(bz.wordSearch(3, 4, board, "SEE"));    // Output: true (1)
        System.out.println(bz.wordSearch(3, 4, board, "ABCB"));   // Output: true (1)
        System.out.println(bz.wordSearch(3, 4, board, "ABFSAB")); // Output: true (1)
        System.out.println(bz.wordSearch(3, 4, board, "ABCD"));   // Output: false (0)
    }
}
