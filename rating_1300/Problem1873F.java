import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1873F {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());

            int a[] = new int[n], h[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());
            for (int i = 0; i < n; i++) h[i] = parseInt(nextToken());

            long ans = 0, cur = 0;
            int r1 = 0, r2 = 0;
            for (int i = 0; i < n; i++) {
                r2 = max(r2, i + 1);
                while (r1 < n && cur + a[r1] <= k) {
                    cur += a[r1];
                    r1++;
                }
                while (r2 < n && h[r2 - 1] % h[r2] == 0) r2++;
                ans = max(ans, min(r1, r2) - i);
                cur -= a[i];
            }
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