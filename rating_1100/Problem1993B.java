import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem1993B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            ArrayList<Integer> od = new ArrayList<>(), ev = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                if ((a[i] & 1) == 0) {
                    ev.add(a[i]);
                } else {
                    od.add(a[i]);
                }
            }
            if (ev.size() == n || od.size() == 0) {
                out.println(0);
                continue;
            }
            Collections.sort(ev);
            Collections.sort(od);
            int ans = ev.size();
            long s = od.get(od.size() - 1);
            for (int v : ev) {
                if (v < s) {
                    s += v;
                } else {
                    ans += 1;
                    break;
                }
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