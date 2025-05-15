package DESI_QNA.BinarySearch;

import java.util.*;

public class main {

    static boolean isValid(long m, int k, List<Integer> a) {
        int count = 0;
        for (int i = 1; i < a.size(); i++) {
            long diff = a.get(i) - a.get(i - 1);
            long temp = diff / m;
            if (diff % m == 0){
                temp--;
            }
            count += temp;
        }
        return count <= k;
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        long low = 1, high = (long) 2e9;
        long res = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isValid(mid, k, list)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        for (int i = 0; i < t; i++) {
            solve(sc);
        }
    }
}
