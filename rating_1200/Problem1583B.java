import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1583B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            var set = new TreeSet<Integer>();
            for (int i = 0; i < m; i++) {
                int a = parseInt(nextToken()), b = parseInt(nextToken()), c = parseInt(nextToken());
                set.add(b);
            }
            int root = -1;
            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) {
                    root = i;
                    break;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (i == root) continue;
                else out.println(root + " " + i);
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