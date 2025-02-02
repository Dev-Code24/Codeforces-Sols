import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem1720C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            int grid[][] = new int[n][m];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                char in[] = nextToken().toCharArray();
                for (int j = 0; j < m; j++) {
                    grid[i][j] = in[j] - '0';
                    sum += grid[i][j];
                }
            }


            int mx = (int) -1e9;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    int cnt = grid[i][j] == 0 ? 1 : 0;
                    cnt += grid[i + 1][j] == 0 ? 1 : 0;
                    cnt += grid[i][j + 1] == 0 ? 1 : 0;
                    cnt += grid[i + 1][j + 1] == 0 ? 1 : 0;
                    mx = max(mx, cnt);
                }
            }

            if (mx >= 2) {
                out.println(sum);
            } else if (mx == 1) {
                out.println(sum - 2 + 1);
            } else {
                out.println(sum - 3 + 1);
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