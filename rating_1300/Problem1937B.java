import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1937B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        char grid[][] = {nextToken().toCharArray(), nextToken().toCharArray()};
        char[] str = new char[n + 1];

        int cnt = 1;
        for (int i = 0, j = 0; i < n; i++) {
            str[j++] = grid[0][i];
            if (i == n - 1 || (grid[0][i + 1] == '1' && grid[1][i] == '0')) {
                for (int k = i; k > 0 && grid[0][k] == grid[1][k - 1]; k--) cnt++;
                while (i < n) str[j++] = grid[1][i++];
            }
        }
        out.println(new String(str));
        out.println(cnt);
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