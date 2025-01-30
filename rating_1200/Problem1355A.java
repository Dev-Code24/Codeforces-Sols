import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1355A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static long getMinMax(long x) {

        long m1 = 10, m2 = 0;
        while (x > 0) {
            m1 = min(m1, x % 10);
            m2 = max(m2, x % 10);
            x /= 10;
        }
        return m1 * m2;
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            long a1 = Long.parseLong(nextToken()), k = Long.parseLong(nextToken());

            long ans = a1;
            for (int i = 1; i <= k - 1; i++) {
                long x = getMinMax(ans);
                if (x == 0) break;
                ans = ans + x;
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