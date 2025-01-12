import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem2053B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int l[] = new int[n], r[] = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = parseInt(nextToken());
                r[i] = parseInt(nextToken());
            }
            int max = Arrays.stream(r).max().getAsInt();
            int cnt[] = new int[max + 1];
            for (int i = 0; i < n; i++) {
                cnt[l[i]] += l[i] == r[i] ? 1 : 0;
            }

            int pref[] = new int[max + 1];
            for (int i = 1; i < max + 1; i++) {
                pref[i] = pref[i - 1] + (cnt[i] == 0 ? 1 : 0);
            }

            char ans[] = new char[n];
            for (int i = 0; i < n; i++) {
                if (l[i] == r[i]) {
                    ans[i] = cnt[l[i]] > 1 ? '0' : '1';
                } else {
                    ans[i] = (pref[r[i]] - pref[l[i] - 1]) > 0 ? '1' : '0';
                }
            }

            out.println(new String(ans));
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
