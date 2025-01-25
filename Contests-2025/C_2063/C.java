import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
 import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n, deg[];
    static TreeSet<Pair> edges;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            edges = new TreeSet<>();
            deg = new int[n + 1];
            for(int i = 0; i < n - 1; i++) {
                int u = parseInt(nextToken()), v = parseInt(nextToken());
                deg[u]++;
                deg[v]++;
                edges.add(new Pair(u,v));
                edges.add(new Pair(v,u));
            }

            long ans = 0;
            ArrayList<Pair> b = new ArrayList<>(n);
            for(int i = 0; i < n; i++) b.add(new Pair(deg[i + 1],i + 1));

            Collections.sort(b,(p1,p2) ->{
                if(p1.first != p2.first) {
                    return Long.compare(p2.first,p1.first);
                }
                return Long.compare(p2.second,p1.second);

            });

            for(int i = 0; i < n - 1; i++) {
                for(int j = i + 1; j < n; j++) {
                    Pair tmp = new Pair(b.get(i).second,b.get(j).second);
                    if(!edges.contains(tmp)){
                        ans = max(ans,b.get(i).first + b.get(j).first - 1);
                        break;
                    }
                }
            }

            for(var p : edges) {
                ans = max(ans, deg[p.first] + deg[p.second] - 2);
            }
            out.println(ans);

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
         int first;
         int second;

         Pair() {
             this.first = 0;
             this.second = 0;
         }

         Pair(int _first, int _second) {
             this.first = _first;
             this.second = _second;
         }
         @Override
         public int compareTo(Pair o) {
             if (this.first != o.first) {
                 return Integer.compare(this.first, o.first);
             }
             return Integer.compare(this.second, o.second);
         }
         @Override
         public String toString() {
             return "(" + first + ',' + second + ")";
         }
         @Override
         public boolean equals(Object o) {
             if (this == o)
                 return true;
             if (o == null || getClass() != o.getClass())
                 return false;
             Pair pair = (Pair) o;
             return first == pair.first && second == pair.second;
         }
     }
}