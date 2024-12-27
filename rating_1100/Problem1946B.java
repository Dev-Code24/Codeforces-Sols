import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;

public class Problem1946B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static long mod = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            long a[] = new long[n];
            long S = 0, sum = 0;
            long curr = 0;
            for (int i = 0; i < n; i++) {
                int x = parseInt(nextToken());
                a[i] = x;
                sum += x;
                curr += x;
                curr = max(curr, 0L);
                S = max(S, curr);
            }

            sum = (sum % mod + mod) % mod;
            S = S % mod;
            long t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * 2) % mod;
            }
            long ans = (sum + S * t - S + mod) % mod;
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