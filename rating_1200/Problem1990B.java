import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
 import static java.lang.Math.min;
 import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1990B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken()), x = parseInt(nextToken()), y = parseInt(nextToken());
        x--;
        y--;

        int a[] = new int[n];

        for(int i = y - 1; i >= 0; i-=2) {
            a[i] = -1;
            if (i - 1 >= 0) a[i - 1] = 1;
        }
        for(int i = x + 1; i < n; i+=2) {
            a[i] = -1;
            if(i + 1 < n) a[i + 1] = 1;
        }

        for(int i = y; i <= x; i++) a[i] = 1;
        for(int i = 0; i < n; i++) out.print(a[i] + " ");
        out.println();
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