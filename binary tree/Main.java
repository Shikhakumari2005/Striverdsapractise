import java.util.*;
 
public class Main {
    static long[] imp_sum = new long[500005];
    static long[] dp = new long[500005];
    static long[] b = new long[500005];
    static long k;
 
    public static void DFS(int node, List<Integer>[] G, int[] used, int[] parent) {
        used[node] = 1;
 
        for (int u : G[node]) {
            if (used[u] == 0) {
                parent[u] = node;
                DFS(u, G, used, parent);
            }
        }
 
        // Bottom-up traversal
        long h = 0, small = Long.MAX_VALUE, v = 0;
        for (int child : G[node]) {
            if (child != parent[node]) {
                h++;
                small = Math.min(small, imp_sum[child]);
                v += dp[child];
            }
        }
 
        if (h == 0) {
            imp_sum[node] = b[node];
            dp[node] = 0; // RRRRR
        } else {
            long g = b[node] + small;
            if (g <= k) {
                imp_sum[node] = g;
                dp[node] = v + h - 1;
            } else {
                imp_sum[node] = b[node];
                dp[node] = v + h;
            }
        }
        System.out.println(node + " " + imp_sum[node] + " " + dp[node]);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        k = sc.nextLong();
        List<Integer>[] G = new ArrayList[n + 1];
 
        for (int i = 1; i <= n; i++) {
            G[i] = new ArrayList<>();
            b[i] = sc.nextLong();
        }
 
        for (int i = 2; i <= n; i++) {
            int u = i, v = sc.nextInt();
            G[u].add(v);
            G[v].add(u);
        }
 
        int[] used = new int[n + 1];
        int[] parent = new int[n + 1];
        DFS(1, G, used, parent); // Start DFS from node 1
 
        if (dp[1] <= m) {
            System.out.println(dp[1] + 1);
        } else {
            System.out.println("-1");
        }
 
        sc.close();
    }
}
