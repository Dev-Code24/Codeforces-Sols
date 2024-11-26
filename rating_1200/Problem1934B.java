import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Problem1934B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int inf = (int) 1e9 + 20, N = 100 + 20;
        int dp[] = new int[N], vals[] = { 1, 3, 6, 10, 15 };

        for (int i = 1; i < N; i++) {
            dp[i] = inf;
            for (int j = 0; j < 5; j++) {
                if (vals[j] <= i)
                    dp[i] = min(dp[i], dp[i - vals[j]] + 1);
            }
        }

        int TC = parseInt(nextToken());

        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int need = (n - 70) / 15;
            if (need < 0)
                need = 0;
            int ans = need;
            n -= need * 15;
            ans += dp[n];

            out.println(ans);
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