import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1909B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        long a[] = new long[n];
        var odd = false;
        var even = false;
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(nextToken());
            if ((a[i] & 1) == 0) even = true;
            else odd = true;
        }

        if(odd && even) {
            out.println(2);
        } else {
            long ans = 2;
            while(true) {
                var set = new TreeSet<Long>();
                for(int i = 0; i < n; i++) set.add(a[i] % ans) ;
                if(set.size() == 2) {
                    out.println(ans);
                    break;
                }
                ans *= 2;
            }
        }

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