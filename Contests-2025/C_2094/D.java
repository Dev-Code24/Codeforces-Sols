import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Math.min;
//import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    //@FunctionalInterface
    //interface Help {
    //    void f(int a[], int i, int j);
    //}

    void solve() throws IOException {
        char[] p = nextToken().toCharArray();
        int n = p.length;
        char[] s = nextToken().toCharArray();
        int m = s.length;

        for (int i = 0, j = 0; i < n || j < m;) {
            int ii = i, jj = j;
            int r = 0, l = 0, rr = 0, ll = 0;
            while (ii < n && p[ii] == p[i]) {
                r += p[ii] == 'R' ? 1 : 0;
                l += p[ii] == 'L' ? 1 : 0;
                ii++;
            }
            i = ii;
            while (jj < m && s[jj] == s[j]) {
                rr += s[jj] == 'R' ? 1 : 0;
                ll += s[jj] == 'L' ? 1 : 0;
                jj++;
            }
            j = jj;
            if (rr < r || ll < l || ll > 2 * l || rr > 2 * r) {
                out.println("NO");
                return;
            }

        }

        out.println("YES");
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new D().solve();
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