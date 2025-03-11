import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2065C1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken()), m = parseInt(nextToken());
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = parseInt(nextToken());
        int b = parseInt(nextToken());

        a[0] = min(b - a[0], a[0]);
        for(int i = 1; i < n; i++) {
            int c = min(b - a[i], a[i]);
            int d = max(b - a[i], a[i]);
            if(c >= a[i - 1]) a[i] = c;
            else {
                if(d < a[i - 1]) {
                    out.println("NO");
                    return;
                }
                a[i] = d;
            }
        }
        out.println("YES");
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