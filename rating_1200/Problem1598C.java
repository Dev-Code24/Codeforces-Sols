import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1598C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        long a[] = new long[n];
        for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

        final double mean = Arrays.stream(a).average().getAsDouble();
        long ans = 0;

        // a1 + a2 + a3 + a4 + ... + an = sum
        // mean = sum / n
        // new_mean = (sum - ai - aj ) / n - 2
        // mean = new_mean
        // => sum ( n - 2 ) = (sum - ai - aj ) ( n )
        // => ( n ) ( ai + aj ) = ( 2 ) sum
        // => ( ai + aj ) / 2 = sum / n = mean
        // => aj = 2 * mean - ai
        var mp = new TreeMap<Double, Integer>();
        for (int i = 0; i < n; i++) {
            double aj = 2 * mean - a[i];
            ans += mp.getOrDefault(aj, 0);
            mp.put((double) a[i], mp.getOrDefault((double) a[i], 0) + 1);
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
}