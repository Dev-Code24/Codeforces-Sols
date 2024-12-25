import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2048B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());

            int a[] = new int[n];
            Arrays.fill(a, -1);
            int val = 0;
            for (int i = k - 1; i < n; i += k) {
                a[i] = ++val;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == -1) {
                    a[i] = ++val;
                }
            }
            for (int i = 0; i < n; i++) {
                out.print(a[i] + (i == n - 1 ? "\n" : " "));
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