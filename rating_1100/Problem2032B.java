import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem2032B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());

            if (n == 1) {
                out.println(1 + "\n" + 1);
                continue;
            }
            if (k == 1 || k == n) {
                out.println(-1);
                continue;
            }

            out.println(3);
            if ((k & 1) == 0) {
                out.println(1 + " " + k + " " + (k + 1));
            } else {
                out.println(1 + " " + (k - 1) + " " + (k + 2));
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