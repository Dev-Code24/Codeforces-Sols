import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1877C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            long n = parseInt(nextToken()), m = parseInt(nextToken());
            int k = parseInt(nextToken());
            if (k > 3) {
                out.println(0);
                continue;
            }

            if (k == 1) {
                out.println(1);
                continue;
            }

            long j = m / n + min(m, n - 1);
            if (k == 2) {
                out.println(j);
                continue;
            }
            if (k == 3) {
                out.println(m - j);
                continue;
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