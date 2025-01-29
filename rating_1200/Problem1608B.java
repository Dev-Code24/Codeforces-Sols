import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
import static java.lang.Math.abs;

public class Problem1608B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), a = parseInt(nextToken()), b = parseInt(nextToken());

            var ans = new ArrayList<Integer>(n);

            if (n >= a + b + 2) {
                if (a == b) {
                    int m = a + b + 2;
                    for (int i = n; i > m; i--) out.print(i + " ");
                    for (int i = 2; i <= m; i+= 2) out.print(i + " " + (i - 1) + " ");
                } else if (a == b + 1) {
                    int m = n - (a + b + 1);
                    for (int i = 1; i <= m; i++) out.print(i + " ");
                    for (int i = m + 2; i <= n; i+=2) out.print(i + " " + (i - 1) + " ");
                } else if (a == b - 1) {
                    int m = a + b + 2;
                    for (int i = 2; i <= m; i+=2) out.print(i + " " + (i - 1) + " ");
                    for (int i = m; i <= n; i++) out.print(i + " ");
                } else out.print(-1);
            } else out.print(-1);

            out.println();
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

