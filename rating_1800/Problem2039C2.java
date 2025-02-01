import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
 import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2039C2 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int x = parseInt(nextToken());
            long m = Long.parseLong(nextToken());

            // if divisible by x
            long p = m - m % x;
            long ans = p/x - (x < p ? 1 : 0);
            if((x ^ p) >= 1 && (x ^ p) <= m) ans++;
            p += x;
            if((x ^ p) >= 1 && (x ^ p) <= m) ans++;

            // if divisible by y
            for (int y = 1; y <= min(x, m); y++) {
                long tmp = (x^y);
                if(tmp % y == 0) ans++;
            }

            if(x <= m) ans--;

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