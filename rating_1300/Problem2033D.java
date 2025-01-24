import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
 import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2033D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long a[] = new long[n];
            for(int i = 0; i < n; i++) a[i] = parseInt(nextToken());

            long pref[] = new long[n + 1];
            for(int i = 0; i < n; i++) pref[i + 1] = pref[i] + a[i];

            var seen = new TreeSet<Long>();
            int ans = 0;
            for(int i = 0; i <= n; i++) {
                if(seen.contains(pref[i])) {
                    ans++;
                    seen.clear();
                }
                seen.add(pref[i]);
            }
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