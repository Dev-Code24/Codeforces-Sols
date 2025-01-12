import java.io.*;
import java.util.*;

public class Problem2035A {
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
        long N = Integer.parseInt(nextToken()), M = Integer.parseInt(nextToken());
        long R = Integer.parseInt(nextToken()), C = Integer.parseInt(nextToken());

        long ans = M - C;
        ans += ((M - 1) + 1 + (M - 1)) * (N - R);
        out.println(ans);
    }
}