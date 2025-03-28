import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1537C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int h[] = new int[n];
        for (int i = 0; i < n; i++) h[i] = parseInt(nextToken());

        Arrays.sort(h);
        int diff = Integer.MAX_VALUE, j = -1;
        for (int i = 0; i < n - 1; i++) {
            if (h[i + 1] - h[i] < diff) {
                diff = h[i + 1] - h[i];
                j = i;
            }
        }

        int ans[] = new int[n];
        ans[0] = h[j];
        ans[n - 1] = h[j + 1];
        int k = 1;
        for (int i = j + 2; i < n; i++, k++) ans[k] = h[i];
        for (int i = 0; k < n - 1; k++, i++) ans[k] = h[i];

        for (int i = 0; i < n; i++) out.print(ans[i] + " ");
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