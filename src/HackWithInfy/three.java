package HackWithInfy;

import java.util.*;
import java.io.*;

public class three {

    static PrintWriter out = new PrintWriter(System.out);
    static FastReader in = new FastReader();

    public static void main(String args[]) throws IOException {
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        out.println(findNumberOfEmployees(A, n));
        out.close();
    }

    static int findNumberOfEmployees(int[] A, int n) {
        Arrays.sort(A); // Step 1: Sort the array
        int maxTeamSize = 0;
        int left = 0;

        // Step 2: Use sliding window
        for (int right = 0; right < n; right++) {
            while (A[right] - A[left] > 5) {
                left++;
            }
            maxTeamSize = Math.max(maxTeamSize, right - left + 1);
        }

        return maxTeamSize;
    }

    // Fast input reader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
    }
}
