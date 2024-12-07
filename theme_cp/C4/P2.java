import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class P2 {
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

            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                ans = max(ans, a[n - 1] - a[i]);
            }
            for (int i = 0; i < n; i++) {
                ans = max(ans, a[i] - a[0]);
            }
            for (int i = 1; i < n; i++) {
                ans = max(ans, a[i - 1] - a[i]);
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