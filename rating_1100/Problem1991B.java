import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1991B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int b[] = new int[n - 1];
            for (int i = 0; i < n - 1; i++)
                b[i] = parseInt(nextToken());

            if (n == 2) {
                out.println(b[0] + " " + b[0]);
                continue;
            }

            int a[] = new int[n];

            for (int i = 0; i + 1 < n - 1; i++) {
                a[i + 1] = b[i] | b[i + 1];
            }
            a[0] = a[1] & b[0];
            a[n - 1] = a[n - 2] & b[n - 2];

            boolean f = false;
            for (int i = 0; i + 1 < n; i++) {
                if ((a[i] & a[i + 1]) != b[i]) {
                    f = true;
                    break;
                }
            }
            if (f) {
                out.println(-1);
            } else {   
                for (int i = 0; i < n; i++) {
                    out.print(a[i] + " ");
                }
                out.println();
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