import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
 import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1992D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        int f(int a);
//   }
    static final int INF = (int)1e7 + 1;
    static void solve() throws IOException {
        int n = parseInt(nextToken()), m = parseInt(nextToken()), k = parseInt(nextToken());
        char s[] = ('L' + nextToken() + 'L').toCharArray();
        n += 2;
        int[] dp = new int[n];
        Arrays.fill(dp,INF);
        dp[0] = 0;
        m++;
        for(int i = 0; i < n; i++) {
            if(dp[i] == INF) continue;
            if(s[i] == 'L') {
                for(int j = i; j < min(n, i + m); j++) {
                    if(s[j] != 'C') dp[j] = min(dp[j],dp[i]);
                }
            }
            if(i + 1 < n && s[i + 1] != 'C') dp[i + 1] = min(dp[i + 1], dp[i] + 1);
        }

        out.println(dp[n - 1] <= k ? "YES" : "NO");
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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