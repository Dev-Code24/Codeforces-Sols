import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
// import static java.lang.Math.min;
// import static java.lang.Math.max;

public class Problem1504B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        char a[] = nextToken().toCharArray(), b[] = nextToken().toCharArray();

        int cnt[] = new int[2];
        for (char i : a) cnt[i - '0']++;
        int balance = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (cnt[0] != cnt[1] && abs(a[i] - '0' - (balance % 2)) != b[i] - '0') {
                out.println("NO");
                return;
            }
            if (cnt[0] != cnt[1]) {
                cnt[a[i] - '0']--;
                continue;
            }
            cnt[a[i] - '0']--;
            if (abs(a[i] - '0' - (balance % 2)) != b[i] - '0') balance++;
        }
        out.println("YES");
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