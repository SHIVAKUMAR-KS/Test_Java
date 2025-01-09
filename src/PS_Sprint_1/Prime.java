package PS_Sprint_1;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        if (isPrime(11))
            System.out.println("Prime");
        else
            System.out.println(" Not Prime");
        if (isPrime(15))
            System.out.println(" Prime");
        else
            System.out.println(" Not Prime");
    }

}
