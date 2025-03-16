import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2065D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        long f(int idx);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken()), m = parseInt(nextToken());
        int[][] a = new int[n][m];
        Pair[] sum = new Pair[n];
        long[][] pref = new long[n][m];
        for(int i = 0; i < n; i++) {
            pref[i][0] = parseInt(nextToken());
            for(int j = 1; j < m; j++) pref[i][j] = parseInt(nextToken()) + pref[i][j - 1];
            sum[i] = new Pair(i, pref[i][m - 1]);
        }

        Arrays.sort(sum,(p1, p2) -> {
            if(p1.second != p2.second) return Long.compare(p2.second,p1.second);
            return p1.first - p2.first;
        });

        long ans = 0L;
        for(int i = 0; i < n; i++) {
            int idx = sum[i].first;
            long cumm = Arrays.stream(pref[idx]).sum();
            ans += cumm;
            ans += ((long)(n - i - 1)) * m * sum[i].second;
        }

        out.println(ans);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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
         long second;

         Pair() {
             this.first = 0;
             this.second = 0L;
         }

         Pair(int _first, long _second) {
             this.first = _first;
             this.second = _second;
         }
         @Override
         public int compareTo(Pair o) {
             if (this.first != o.first) {
                 return Long.compare(this.first, o.first);
             }
             return Long.compare(this.second, o.second);
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
         @Override
         public int hashCode() {
             return Objects.hash(first, second);
         }
     }
}