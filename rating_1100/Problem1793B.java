import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
// import static java.lang.Math.min;
// import static java.lang.Math.max;

public class Problem1793B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int x = parseInt(nextToken()), y = parseInt(nextToken());
            out.println((2 * abs(x - y)));
            for (int i = y; i <= x; i++) {
                out.print(i + " ");
            }
            for (int i = x - 1; i > y; i--) {
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