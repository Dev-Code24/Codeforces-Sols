import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1879B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n], b[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = parseInt(nextToken());
        for(int i = 0; i < n; i++) b[i] = parseInt(nextToken());

        int mnA = Arrays.stream(a).min().getAsInt(), mnB = Arrays.stream(b).min().getAsInt() ;

        long sumA = 0, sumB = 0;
        for(int i = 0; i < n; i++) {
            sumA += a[i] + mnB;
            sumB += b[i] + mnA;
        }

        out.println(min(sumA,sumB));
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