import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Math.min;
import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    //@FunctionalInterface
    //interface Help {
    //    void f(int a[], int i, int j);
    //}

    void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

        long cnt[] = new long[30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < n; j++) cnt[i] += ((a[j] >> i) & 1);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long tot = 0;
            for (int b = 0; b < 30; b++) {
                if (((a[i] >> b) & 1) == 1) tot += (1 << b) * (n - cnt[b]);
                else tot += (1 << b) * cnt[b];
            }
            ans = max(ans, tot);
        }
        out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new E().solve();
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