import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
import static java.lang.Math.max;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken()), m = parseInt(nextToken());
        int a[][] = new int[n][m];
        var set = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = parseInt(nextToken());
                set.add(a[i][j]);
            }
        }

        var mp = new TreeMap<Integer, Integer>();
        for (int el : set) mp.put(el, 0);

        int dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // the optimisation that I have made here is very advanced level shit
                // so instead of making redundant mp.put() ops, reducing the number of mp.put()
                // ops helps in improving the time-complexity of the code
                mp.put(a[i][j], max(1, mp.getOrDefault(a[i][j], 0)));
                for (int k = 0; k < 4; k++) {
                    int r = i + dir[k][0];
                    int c = j + dir[k][1];
                    if (r < 0 || r >= n || c < 0 || c >= m) continue;

                    if (a[i][j] == a[r][c]) mp.put(a[i][j], 2);
//                    else mp.put(a[i][j], max(1, mp.getOrDefault(a[i][j], 0)));

                }
            }
        }

        int mx = Collections.max(mp.values());
        int ans = 0;
        for (int val : mp.values()) ans += val;

        out.println(ans - mx);
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