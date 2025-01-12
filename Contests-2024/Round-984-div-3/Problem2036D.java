import java.io.*;
import java.util.*;

public class Problem2036D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            solve();

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

    private static void solve() throws IOException {
        int N = Integer.parseInt(nextToken()), M = Integer.parseInt(nextToken());
        char c[][] = new char[N][M];
        for (int i = 0; i < N; i++) {
            c[i] = nextToken().toCharArray();
        }
        int layers = Math.min(N, M) / 2;
        int cnt = 0;
        for (int layer = 0; layer < layers; layer++) {
            StringBuilder result = new StringBuilder();
            for (int i = layer; i < M - layer; i++) {
                result.append(c[layer][i]);
            }
            for (int i = layer + 1; i < N - layer; i++) {
                result.append(c[i][M - layer - 1]);
            }
            if (N - layer - 1 > layer) {
                for (int i = M - layer - 2; i >= layer; i--) {
                    result.append(c[N - layer - 1][i]);
                }
            }
            if (M - layer - 1 > layer) {
                for (int i = N - layer - 2; i > layer; i--) {
                    result.append(c[i][layer]);
                }
            }

            String res = result.toString();
            int len = res.length();
            res = res.substring(len - 3, len) + res;
            for (int i = 0; i < res.length(); i++) {
                if (i + 4 < res.length() && res.substring(i, i + 4).contains("1543")) {
                    cnt++;
                }
            }
        }
        out.println(cnt);
    }
}