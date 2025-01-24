import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2051D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n;
    static long a[], x, y;

    static int upper_bound(ArrayList<Long> list, long key) {
        int lo = -1, hi = list.size();
        while (lo + 1 < hi) {
            int m = (lo + hi) / 2;
            if (list.get(m) <= key) {
                lo = m;
            } else {
                hi = m;
            }
        }
        return hi;
    }

    static long counterFn(long sum) {
        long cnt = 0;
        var list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            int c = upper_bound(list, sum - a[i]);
            cnt += c;
            list.add(a[i]);
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            x = Long.parseLong(nextToken());
            y = Long.parseLong(nextToken());
            a = new long[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

            Arrays.sort(a);

            long sum = Arrays.stream(a).sum(), L = sum - y, R = sum - x;
            out.println(counterFn(R) - counterFn(L - 1));
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