import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem1925B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int x = parseInt(nextToken()), n = parseInt(nextToken());

            int ans = 1;
            for (int i = 1; i * i <= x; i++) {
                if (x % i == 0) {
                    if (n <= x / i)
                        ans = max(ans, i);
                    if (n <= i)
                        ans = max(ans, x / i);
                }
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