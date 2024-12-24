import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;

public class Problem2007B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            long a[] = new long[n];
            long mx = -1;
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                mx = max(mx, a[i]);
            }

            for (int i = 1; i <= m; i++) {
                char c = nextToken().toCharArray()[0];
                int l = parseInt(nextToken()), r = parseInt(nextToken());
                if (c == '+') {
                    mx += (l <= mx && mx <= r) ? 1 : 0;
                } else {
                    mx += (l <= mx && mx <= r) ? -1 : 0;
                }
                out.print(mx + (i != m ? " " : "\n"));
            }
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