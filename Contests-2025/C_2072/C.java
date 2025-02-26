import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken()), x = parseInt(nextToken());

        int a[] = new int[n], or = 0;
        for(int i = 0, j = 0; i < n && j < n; i++) {
            if((i | x) != x) break;

            or |= i;
            a[j++] = i;
        }

        if(or != x) {
            a[n - 1] = x;
        }
        for (int i : a) out.print(i + " ");
        out.println();
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