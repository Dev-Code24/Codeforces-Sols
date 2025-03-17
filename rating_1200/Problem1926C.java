import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1926C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

  @FunctionalInterface
    interface Help {
        int f(int a);
   }
    static int ans[], N = (int)2e5 + 10;
    static void solve() throws IOException {
        int n = parseInt(nextToken());
        out.println(ans[n]);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        ans = new int[N];
        Help f = (n) -> {
            int sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        };
        ans[1] = 1;
        for(int i = 2; i < ans.length; i++) ans[i] = f.f(i) + ans[i - 1];

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