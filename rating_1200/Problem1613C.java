import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1613C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        long h = Long.parseLong(nextToken());
        long a[] = new long[n];
        for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

        long lo = 0, hi = (long) 1e18;
        while (lo + 1 < hi) {
            long k = lo + (hi - lo) / 2;
            long curr = k;
            for (int i = 0; i < n - 1; i++) curr += min(k, a[i + 1] - a[i]);

            if (curr >= h) hi = k;
            else lo = k;
        }

        out.println(hi);
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