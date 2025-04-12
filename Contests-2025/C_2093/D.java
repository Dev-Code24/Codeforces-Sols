import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Math.min;
//import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    long number (long x, long y, long n) {
        if (n == 1) {
            if (x == 1 && y == 1) return 1;
            if (x == 2 && y == 2) return 2;
            if (x == 2 && y == 1) return 3;
            if (x == 1 && y == 2) return 4;
        }

        long size = 1L << (n - 1), block = size * size;
        if( x <= size && y <= size) {
            return number(x, y, n - 1);
        } else if (x > size && y > size) {
            return block + number(x - size, y - size, n - 1);
        } else if (x > size) {
            return 2 * block + number(x - size, y, n - 1);
        }

        return 3 * block + number(x, y - size, n - 1);
    }

    long[] pos (long d, long n) {
        if (n == 1) {
            if (d == 1) return new long[] {1, 1};
            if (d == 2) return new long[] {2, 2};
            if (d == 3) return new long[] {2, 1};
            if (d == 4) return new long[] {1, 2};
        }

        long size = 1L << (n - 1), block = size * size, res[];
        if (d <= block) {
            return pos(d, n - 1);
        } else if (d <= 2 * block) {
            res = pos(d - block, n - 1);
            res[0] += size; res[1] += size;
            return res;
        } else if (d <= 3 * block) {
            res = pos(d - 2 * block, n - 1);
            res[0] += size;
            return res;
        }

        res = pos(d - 3 * block, n - 1);
        res[1] += size;
        return res;
    }

    void solve() throws IOException {
        long n = parseInt(nextToken());
        int q = parseInt(nextToken());

        for (long i = 0; i < q; i++) {
           String arrow = nextToken();
           long x, y, d;
           if (arrow.equals("->")) {
                x = Long.parseLong(nextToken()); y = Long.parseLong(nextToken());
                out.println(number(x, y ,n));
           } else {
               d = Long.parseLong(nextToken());
               long ans[] = pos(d, n);
               out.println( ans[0] + " " + ans[1] );
           }
        }


    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new D().solve();
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