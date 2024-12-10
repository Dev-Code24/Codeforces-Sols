import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem2013B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }

            long s = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (i == n - 2) {
                    s += a[n - 2];
                } else {
                    s -= a[i];
                }
            }
            out.println(a[n - 1] - s);
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