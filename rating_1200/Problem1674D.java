import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1674D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = parseInt(nextToken());

        boolean b = true;
        int c[] = new int[n + 1];
        if((n & 1) == 1) {
            c[1] = a[1];
        }
        for(int i = ((n & 1) == 1) ? 2 : 1; i <= n; i += 2) {
            c[i] = min(a[i], a[i + 1]);
            c[i + 1] = max(a[i],a[i + 1]);
        }
        for(int i = 1; i < n ; i++) {
            if(c[i] > c[i + 1]) {
                b = false;
                break;
            }
        }

        out.println(b ? "YES" : "NO");
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