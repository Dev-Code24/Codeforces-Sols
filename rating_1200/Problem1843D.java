import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1843D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static ArrayList<ArrayList<Integer>> adj;
    static int leafs[];

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            adj = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<Integer>());
            }

            for (int i = 0; i < n - 1; i++) {
                int u = parseInt(nextToken()), v = parseInt(nextToken());
                u--;
                v--;
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

            // need to find the number of leaf-nodes each node has
            leafs = new int[n];
            dfs(0, -1);
            int q = parseInt(nextToken());
            for (int i = 0; i < q; i++) {
                int u = parseInt(nextToken()), v = parseInt(nextToken());
                u--;
                v--;
                out.println((long) leafs[u] * (long) leafs[v]);
            }
        }

        out.flush();
        out.close();
        br.close();
    }

    // returns number of leaf node a node has
    static int dfs(int node, int parent) {
        if (adj.get(node).size() == 1 && parent != -1) {
            return leafs[node] = 1;
        }
        int sum = 0;
        for (int child : adj.get(node)) {
            if (child == parent)
                continue;
            sum += dfs(child, node);
        }

        return leafs[node] = sum;
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}