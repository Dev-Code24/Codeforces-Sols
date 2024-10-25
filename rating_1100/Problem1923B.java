import java.io.*;
import java.util.*;
import static java.lang.Math.abs;

public class Problem1923B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), K = Integer.parseInt(nextToken());
            int[] A = new int[N], X = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(nextToken());
            for (int i = 0; i < N; i++)
                X[i] = Integer.parseInt(nextToken());

            long s[] = new long[N + 1];
            for (int i = 0; i < N; i++)
                s[abs(X[i])] += A[i];

            boolean ok = true;
            long lft = 0;
            for (int i = 1; i <= N; i++) {
                lft += K - s[i];
                ok &= (lft >= 0);
            }
            out.println(ok ? "YES" : "NO");

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