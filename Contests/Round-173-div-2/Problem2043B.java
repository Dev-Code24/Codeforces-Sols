import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2043B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int d = parseInt(nextToken());

            out.print(1 + " ");
            if (n >= 3 || d % 3 == 0) {
                out.print(3 + " ");
            }
            if (d == 5) {
                out.print(5 + " ");
            }
            if (d % 7 == 0 || n >= 3) {
                out.print(7 + " ");
            }
            if (d == 9 || ((d == 3 || d == 6) && n >= 3) || n >= 6) {
                out.print(9 + " ");
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