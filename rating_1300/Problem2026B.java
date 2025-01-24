import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;

public class Problem2026B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n;
    static long a[];

    static boolean good(long m) {
        boolean b = true;
        for (int i = 0, c = 1; i < n; ) {
            if (i + 1 < n) {
                if (a[i + 1] - a[i] <= m) {
                    i += 2;
                } else if (c > 0) {
                    c--;
                    i++;
                } else {
                    b = false;
                    break;
                }
            } else {
                if (c == 0) {
                    b = false;
                }
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(nextToken());

            if ((n & 1) == 0) {
                long mx = -Long.MAX_VALUE;
                for (int i = 1; i < n; i += 2) mx = max(mx, a[i] - a[i - 1]);
                out.println(mx);
                continue;
            }
            if (n == 1) {
                out.println(1);
                continue;
            }

            long l = 0, r = a[n - 1] - a[0];
            while (l + 1 < r) {
                long m = (r + l) / 2;
                if (good(m)) {
                    r = m;
                } else {
                    l = m;
                }
            }
            out.println(r);
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