import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1581B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            long n, m, k;
            n = parseInt(nextToken());
            m = parseInt(nextToken());
            k = parseInt(nextToken());

            // m < n - 1 (if n - 1 then a binary tree is formed and we want connected graph)
            // m > nc2 (if so then one or more than one node will become multi edged)
            boolean yes = true;
            if (m < n - 1 || m > (n * (n - 1)) / 2) {
                yes = false;
            } else {
                int dia = 0;
                if (m == (n * (n - 1)) / 2) dia = 1;
                else dia = 2;

                if (n == 1) dia = 0;

                yes = dia < k - 1;
            }
            out.println(yes ? "YES" : "NO");

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