import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
 import static java.lang.Math.min;
 import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1808A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    @FunctionalInterface
    interface Helper {
        int diff(int num);
    }

    static void solve() throws IOException {
        int l = parseInt(nextToken()), r = parseInt(nextToken());
        r = min(r,l + 100);

        Helper f = (num) -> {
            int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
            while(num > 0) {
                mn = min(mn, num % 10);
                mx = max(mx, num % 10);
                num /= 10;
            }

            return mx - mn;
        };

        int mx = -1, ans = -1;
        for(int i = l; i <= r; i++) {
            if(f.diff(i) > mx) {
                mx = f.diff(i);
                ans = i;
            }
        }
        out.println(ans);
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