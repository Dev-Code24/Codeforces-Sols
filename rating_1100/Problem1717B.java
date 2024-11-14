import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1717B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            int r = parseInt(nextToken()) - 1, c = parseInt(nextToken()) - 1;

            char[][] ans = new char[n][n];
            for (char[] row : ans) {
                Arrays.fill(row, '.');
            }
            ans[r][c] = 'X';

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) % k == (r + c) % k) {
                        ans[i][j] = 'X';
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(ans[i][j] + (j != n - 1 ? "" : "\n"));
                }
            }

        }

        out.flush();
        out.close();
        br.close();
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}