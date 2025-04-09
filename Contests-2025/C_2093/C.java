import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Math.min;
//import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    //@FunctionalInterface
    //interface Help {
    //    void f(int a[], int i, int j);
    //}

    void solve() throws IOException {
        char [] x = nextToken().toCharArray();
        int k = parseInt(nextToken());

        String xs = new String(x);
        StringBuilder sb = new StringBuilder();
        sb.append(xs.repeat( k));
        BigInteger y = new BigInteger(sb.toString());
        out.println(y.isProbablePrime(10) ? "YES" : "NO");
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new C().solve();
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