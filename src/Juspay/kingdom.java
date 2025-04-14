package Juspay;


import java.util.*;

public class kingdom {

    public static void main(String[] args) {
        int n = 6;
        int[][] nobles = {
                {-1, 0},
                {1, 1},
                {1, 1},
                {3, 1},
                {3, 0},
                {3, 0}
        };

        List<Integer> removalOrder = removeRebelliousNobles(n, nobles);

        if (removalOrder.size() == 1 && removalOrder.get(0) == -1) {
            System.out.println(-1);
        } else {
            for (int noble : removalOrder) {
                System.out.print(noble + " ");
            }
        }
    }

    public static List<Integer> removeRebelliousNobles(int n, int[][] nobles) {
        List<Integer> result = new ArrayList<>();
        List<Integer>[] children = new ArrayList[n + 1];
        int[] parent = new int[n + 1];
        int[] respect = new int[n + 1];
        boolean[] removed = new boolean[n + 1];

        for (int i = 1; i <= n; i++) children[i] = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int p = nobles[i - 1][0];
            int r = nobles[i - 1][1];
            parent[i] = p;
            respect[i] = r;

            if (p != -1) children[p].add(i);
        }

        boolean changed = true;
        while (changed) {
            changed = false;

            for (int i = 1; i <= n; i++) {
                if (removed[i] || parent[i] == -1 || respect[i] == 0) continue;

                boolean canRemove = true;
                for (int child : children[i]) {
                    if (!removed[child] && respect[child] == 0) {
                        canRemove = false;
                        break;
                    }
                }

                if (canRemove) {
                    result.add(i);
                    removed[i] = true;

                    // reassign children to grandparent
                    int par = parent[i];
                    for (int child : children[i]) {
                        if (!removed[child]) {
                            parent[child] = par;
                            children[par].add(child);
                        }
                    }

                    children[i].clear();
                    changed = true;
                    break;  // Start again from smallest index
                }
            }
        }

        return result.isEmpty() ? List.of(-1) : result;
    }
}
