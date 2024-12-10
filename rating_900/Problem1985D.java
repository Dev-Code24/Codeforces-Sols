import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1985D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());

            char grid[][] = new char[n][m];
            int x = 0, y = 0;
            int h = Integer.MIN_VALUE, w = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                grid[i] = nextToken().toCharArray();
                int l = 0, r = 0;
                while (r < m) {
                    while (r < m && grid[i][r] == '.') {
                        r++;
                    }
                    l = r;
                    while (r < m && grid[i][r] == '#') {
                        r++;
                    }
                    if (w < r - l + 1) {
                        w = r - l + 1;
                        y = l + (r - l) / 2;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                int t = 0, b = 0;
                while (b < n) {
                    while (b < n && grid[b][i] == '.') {
                        b++;
                    }
                    t = b;
                    while (b < n && grid[b][i] == '#') {
                        b++;
                    }
                    if (h < b - t + 1) {
                        h = b - t + 1;
                        x = t + (b - t) / 2;
                    }
                }
            }

            out.println(++x + " " + ++y);

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