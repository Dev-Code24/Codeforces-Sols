import java.io.*;
import java.util.*;

public class Problem2030B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    private static void solve() throws IOException {
        int N = Integer.parseInt(nextToken());
        String ans = "";
        if (N == 1) {
            out.println(0);
            return;
        }
        ans += 0;
        while (ans.length() < N - 1) {
            ans += ans;
        }
        out.println((ans.substring(0, N - 1) + 1));
    }

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
}