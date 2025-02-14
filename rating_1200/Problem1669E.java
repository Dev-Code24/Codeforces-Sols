import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1669E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        long ans = 0;
        long cnt[][] = new long[12][12];
        for(int i = 0; i < n; i++) {
            char s[] = nextToken().toCharArray();
            for(int j = 0; j < 12; j++) {
                if('a' + j != s[0]) ans += cnt[j][s[1] - 'a'];
                if('a' + j != s[1]) ans += cnt[s[0] - 'a'][j];
            }
            cnt[s[0] - 'a'][s[1] - 'a']++;
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