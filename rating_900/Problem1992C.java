import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1992C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken()), k = parseInt(nextToken());

            for (int i = n; i >= k; i--) {
                out.print(i + " ");
            }
            for (int i = k - 1; i > m; i--) {
                out.print(i + " ");
            }
            for (int i = 1; i <= m; i++) {
                out.print(i + " ");
            }
            out.println();
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