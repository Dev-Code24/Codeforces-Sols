import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1742E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n, q;

    static int upper_bound(ArrayList<Integer> list, int key) {
        int lo = -1, hi = list.size();
        while (lo + 1 < hi) {
            int m = (lo + hi) / 2;
            if(list.get(m) <= key) {
                lo = m;
            }else {
                hi = m;
            }
        }
        return hi;
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            q = parseInt(nextToken());

            long pref[] = new long[n + 1];
            var pref_max = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                int a = parseInt(nextToken());
                if (i == 0) {
                    pref[1] = a;
                    pref_max.add(a);
                } else {
                    pref[i + 1] = pref[i] + a;
                    pref_max.add((max(pref_max.get(i - 1), a)));
                }
            }

            for (int i = 0; i < q; i++) {
                int k = parseInt(nextToken());
                int ind = upper_bound(pref_max, k);
                out.print(pref[ind] + " ");
            }

            out.println();
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