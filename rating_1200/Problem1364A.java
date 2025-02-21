import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class Problem1364A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken()), x = parseInt(nextToken());
        int a[] = new int[n];
        int sum = 0, flag = -1;
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
            sum += a[i];
            if (a[i] % x != 0) {
                flag = 1;
            }
        }
        if (flag == -1) {
            out.println(-1);
            return;
        }
        if (sum % x != 0) {
            out.println(n);
            return;
        }

        int l = -1, r = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % x != 0 && l == -1) l = i;
            if (a[i] % x != 0) r = i;
        }
        int ans = max(n - l - 1, r);
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