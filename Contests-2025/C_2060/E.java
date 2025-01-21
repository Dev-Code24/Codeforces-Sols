import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static class DisjointSet {
        private int parent[], sz[];

        public DisjointSet(int n) {
            // 1 based indexing
            parent = new int[n + 1];
            for(int i = 0; i < n + 1; i++) parent[i] = i;
            // initial ranking of each element is 0
            sz = new int[n + 1];
            Arrays.fill(sz,1);
        }
        // find_parent with path compression
        int find_parent(int node) {
            if(node == parent[node]) {
                return node;
            }
            return parent[node] = find_parent(parent[node]);
        }
        // union by size
        void union(int u, int v) {
            int ultimate_par_u = find_parent(u), ultimate_par_v = find_parent(v);
            if(ultimate_par_u == ultimate_par_v) return ;

            if(sz[ultimate_par_v] > sz[ultimate_par_u]) {
                parent[ultimate_par_u] = parent[ultimate_par_v];
                sz[ultimate_par_v] += sz[ultimate_par_u];
            }else {
                parent[ultimate_par_v] = parent[ultimate_par_u];
                sz[ultimate_par_u] += sz[ultimate_par_v];
            }
        }
    }

    static int n, m1, m2;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            m1 = parseInt(nextToken());
            m2 = parseInt(nextToken());


            int f[][] = new int[m1][2];
            DisjointSet ff = new DisjointSet(n), gg = new DisjointSet(n);
            for(int i = 0; i < m1; i++) {
                f[i][0] = parseInt(nextToken());
                f[i][1] = parseInt(nextToken());
            }
            for(int i = 0; i < m2; i++) {
                int u = parseInt(nextToken()), v= parseInt(nextToken());
                gg.union(u,v);
            }

            int ops = 0;
            for(int uv[] : f) {
                if(gg.find_parent(uv[0]) == gg.find_parent(uv[1])) {
                    ff.union(uv[0],uv[1]);
                }else ops++;
            }

            TreeSet<Integer> fset = new TreeSet<>(), gset = new TreeSet<>();
            for(int i = 1; i <= n; i++) {
                fset.add(ff.find_parent(i));
                gset.add(gg.find_parent(i));
            }
            ops += fset.size() - gset.size();
            out.println(ops);
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
}