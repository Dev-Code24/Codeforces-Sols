import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1637C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        int f(int a);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = parseInt(nextToken());

        if(Arrays.stream(Arrays.copyOfRange(a,1,n - 1)).max().getAsInt() == 1 || (n == 3 && a[1] % 2 == 1)) {
            out.println(-1);
            return;
        }

        int ans = 0;
        for(int i = 1; i < n - 1; i++) ans += (a[i] + 1) / 2;
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