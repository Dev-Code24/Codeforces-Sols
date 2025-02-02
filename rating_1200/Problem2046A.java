import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem2046A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[][] = new int[2][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) a[i][j] = parseInt(nextToken());
            }
            int cost = 0, common = (int) -1e9;
            for (var i = 0; i < n; i++) {
                cost += max(a[0][i], a[1][i]);
                common = max(min(a[0][i], a[1][i]), common);
            }
            out.println(cost + common);

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