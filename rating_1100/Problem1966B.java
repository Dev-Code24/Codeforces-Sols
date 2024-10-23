import java.io.*;
import java.util.*;

public class Problem1966B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), M = Integer.parseInt(nextToken());
            char grid[][] = new char[N][M];
            for (int i = 0; i < N; i++) {
                grid[i] = nextToken().toCharArray();
            }

            boolean isSame1 = true, isSame2 = true;
            for (int i = 0; i + 1 < M; i++) {
                if (grid[0][i] != grid[0][i + 1])
                    isSame1 = false;
                if (grid[N - 1][i] != grid[N - 1][i + 1])
                    isSame2 = false;
            }
            if (isSame1 && isSame2 && grid[0][0] != grid[N - 1][M - 1]) {
                out.println("NO");
                continue;
            }

            isSame1 = true;
            isSame2 = true;

            for (int i = 0; i + 1 < N; i++) {
                if (grid[i][0] != grid[i + 1][0])
                    isSame1 = false;
                if (grid[i][M - 1] != grid[i + 1][M - 1])
                    isSame2 = false;
            }

            if (isSame1 && isSame2 && grid[0][0] != grid[N - 1][M - 1]) {
                out.println("NO");
                continue;
            }
            out.println("YES");
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