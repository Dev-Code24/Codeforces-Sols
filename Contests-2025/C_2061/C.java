import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static final int mod = 998244353;

    static int n, a[], dp[];

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            a = new int[n + 1];
            for (int i = 1; i < n + 1; i++) a[i] = parseInt(nextToken());

            if (n == 1) {
                if (a[1] == 0) {
                    out.println(2);
                    continue;
                }
                out.println(1);
                continue;
            }

            dp = new int[n + 1];
            // dp[i] = ways such that i is the honest guy and this is valid
            for (int i = 1; i < n + 1; i++) {
                if(a[i] >= i) continue;
                // this is the first honest guy
                if (a[i] == i - 1 && i <= 2) {
                    dp[i] = 1;
                }
                // this is not the first honest guy
                // case 1 : either i - 1 is the honest guy
                if (i >= 2 && a[i] == a[i - 1]) {
                    dp[i] += dp[i - 1];
                }

                //  case 2 : or i - 2 is honest and i - 1 liar
                if (i >= 3 && a[i] == a[i - 2] + 1) {
                    dp[i] += dp[i - 2];
                }

                dp[i] %= mod;
            }
            int ans = dp[n] + dp[n - 1];
            ans %= mod;
            out.println(ans);
        }

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