package HackWithInfy;


import java.util.*;

public class one {
    public static int minimumCandies(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Step 1: Give each child 1 candy initially
        Arrays.fill(candies, 1);

        // Step 2: Left to right - if rating[i] > rating[i-1], candies[i] = candies[i-1] + 1
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to left - if rating[i] > rating[i+1] and candies[i] <= candies[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum all candies
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

