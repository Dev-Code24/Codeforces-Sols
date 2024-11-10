import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1669G {
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
            for (int i = 0; i < n; i++) {
                grid[i] = nextToken().toCharArray();
            }

            for (int j = 0; j < m; j++) {
                int k = n - 1;
                for (int i = n - 1; i >= 0; i--) {
                    if (grid[i][j] == 'o') {
                        k = i - 1;
                    } else if (grid[i][j] == '*') {
                        grid[i][j] = '.';
                        grid[k][j] = '*';
                        k--;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                out.println(new String(grid[i]));
            }
        }
        out.flush();
        out.close();
        br.close();
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null)
                return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
}
