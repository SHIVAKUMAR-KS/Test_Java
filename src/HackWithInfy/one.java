package HackWithInfy;


import java.util.*;

public class one {
    public static int minimumCandies(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of children
        int n = scanner.nextInt();
        int[] ratings = new int[n];

        // Input: ratings array
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        // Output: minimum candies
        System.out.println(minimumCandies(ratings));
    }
}

