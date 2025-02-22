import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1363A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken()), x = parseInt(nextToken());
        int f[] = new int[2];
        for (int i = 0; i < n; i++) {
            int a = parseInt(nextToken());
            f[a % 2]++;
        }

        for (int i = 1; i <= x && i <= f[1]; i += 2) {
            if (x - i <= f[0]) {
                out.println("YES");
                return;
            }
        }

        out.println("NO");

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