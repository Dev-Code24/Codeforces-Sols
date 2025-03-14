import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1541B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());
        int map[] = new int[2 * n + 1];
        for (int i = 0; i < n; i++) map[a[i]] = i + 1;
        int res = 0;
        for (int i = 1; i <= 2 * n; i++) {
            if (map[i] > 0) {
                for (int x = i; x <= 2 * n; x += i) {
                    if (map[x / i] > 0 && map[i] + map[x / i] == x && i != x / i) res++;
                }
            }
        }
        out.println(res / 2);
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