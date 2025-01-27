import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
 import static java.lang.Math.min;
 import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n;
    static Pair range[];
    static ArrayList<ArrayList<Integer>> adj;
    static long val[],dp[];

    static void dfs_assigning_val(int v, int parent) {
        long max = 0;
        for(int node : adj.get(v)) {
            if(node != parent) {
                dfs_assigning_val(node,v);
                max = max(max,val[node]);
            }
        }
        val[v] = max(range[v].l, min(range[v].r,max));
    }

    static void dfs(int v, int parent) {
        for(int i : adj.get(v)) {
            if(i != parent) {
                dfs(i,v);
                dp[v] += dp[i];
                if(val[i] > val[v]) {
                    dp[v] += val[i] - val[v];
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            range = new Pair[n + 1];
            range[0] = new Pair();
            for(int i = 1; i <= n; i++) {
                int l = parseInt(nextToken()), r = parseInt(nextToken());
                range[i] = new Pair(l,r);
            }

            adj = new ArrayList<>(n);
            for(var i = 0; i <= n; i++) adj.add(new ArrayList<>());

            for(var i = 0; i < n - 1; i++) {
                int u = parseInt(nextToken()), v = parseInt(nextToken());
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

            val = new long[n + 1];
            dfs_assigning_val(1,-1);
            dp = new long[n + 1];
            dfs(1,-1);
            out.println(dp[1] + val[1]);

        }

        out.flush();
        out.close();
        br.close();
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

     static class Pair implements Comparable<Pair> {
         long l;
         long r;

         Pair() {
             this.l = 0L;
             this.r = 0L;
         }

         Pair(long _l, long _second) {
             this.l = _l;
             this.r = _second;
         }
         @Override
         public int compareTo(Pair o) {
             if (this.l != o.l) {
                 return Long.compare(this.l, o.l);
             }
             return Long.compare(this.r, o.r);
         }
         @Override
         public String toString() {
             return "(" + l + ',' + r + ")";
         }
         @Override
         public boolean equals(Object o) {
             if (this == o)
                 return true;
             if (o == null || getClass() != o.getClass())
                 return false;
             Pair pair = (Pair) o;
             return l == pair.l && r == pair.r;
         }
         @Override
         public int hashCode() {
             return Objects.hash(l, r);
         }
     }
}