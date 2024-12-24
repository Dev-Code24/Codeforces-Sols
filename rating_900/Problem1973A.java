import java.io.*;
import java.util.*;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;

public class Problem1973A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int p1 = parseInt(nextToken()), p2 = parseInt(nextToken()), p3 = parseInt(nextToken());
            int s = p1 + p2 + p3;

            if ((s & 1) == 1) {
                out.println(-1);
            } else {
                out.println(min(s / 2, p1 + p2));
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