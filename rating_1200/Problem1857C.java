import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1857C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int m = n * (n - 1) / 2, b[] = new int[m];
        for (int i = 0; i < m; i++) b[i] = parseInt(nextToken());

        Arrays.sort(b);

        for (int i = 0; i < m; i += --n) out.print(b[i] + " ");
        out.println((int)1e9);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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