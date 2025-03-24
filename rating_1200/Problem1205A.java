import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1205A {
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

        int[] arr = new int[2*n];
        for (int i = 1; i <= 2 * n; i += 2) {
            arr[i - 1] = i;
            arr[(i + n - 1) % (2 * n)] = i + 1;
        }
        n = 2 * n;
        if(Arrays.stream(arr).asLongStream().sum() != (long) n * (n + 1) / 2) {
            out.println("NO");
            return;
        }

        out.println("YES");
        for (int i : arr) out.print(i + " ");
        out.println();
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
//        int TC = parseInt(nextToken());
        solve();
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