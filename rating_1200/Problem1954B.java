import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Problem1954B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            // a[i−1] = a[i+1], and replace a[i] with a[i-1]
            int n = parseInt(nextToken());

            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }

            int lst = -1, ans = n;
            for (int i = 0; i < n; i++) {
                if (a[i] != a[0]) {
                    ans = min(ans, i - lst - 1);
                    lst = i;
                }
            }
            ans = min(ans, n - lst - 1);
            if (ans == n) {
                out.println(-1);
            } else {
                out.println(ans);
            }

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