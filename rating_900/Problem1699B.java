import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1699B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        int f(int a);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken()), m = parseInt(nextToken());
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                out.print((i%4 <= 1) != (j%4 <= 1) ? 1 + " " : 0 + " ");
            }
            out.println();
        }
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
}