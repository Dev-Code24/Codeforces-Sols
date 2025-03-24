import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        int f(int a);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int[] a = new int[n];
        int zero = 1;
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
            if (zero == 1 && a[i] == 0) {
                zero = 0;
            }
        }

        if (zero != 0) {
            out.println(1);
            out.println(1 + " " + n);
            return;
        }

        if (a[0] == 0 && a[n - 1] == 0) {
            out.println(3);
            out.println(3 + " " + n);
            out.println(1 + " " + 2);
            out.println(1 + " " + 2);
            return;
        }

        if (a[0] > 0) {
            out.println(2);
            out.println(2 + " " + n);
            out.println(1 + " " + 2);
            return;
        }

        if (a[n - 1] > 0) {
            out.println(2);
            out.println(1 + " " + (n - 1));
            out.println(1 + " " + 2);
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