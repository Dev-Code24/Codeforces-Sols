import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;

public class A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            int ans = 0;
            int x[] = new int[n], y[] = new int[n];

            x[0] = parseInt(nextToken());
            y[0] = parseInt(nextToken());
            for (int i = 1; i < n; i++) {
                x[i] = parseInt(nextToken()) + x[i - 1];
                y[i] = parseInt(nextToken()) + y[i - 1];
            }

            for (int i = 1; i < n; i++) {
                ans += 2 * (x[i] - x[i - 1]);
                ans += 2 * (y[i] - y[i - 1]);
            }
            out.println(ans + 4 * m);

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