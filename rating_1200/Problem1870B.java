import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1870B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());
            int a[] = new int[n], b[] = new int[m];
            int xor = 0;
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                xor ^= a[i];
            }

            int orb = 0;
            for (int i = 0; i < m; i++) {
                b[i] = parseInt(nextToken());
                orb |= b[i];
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans ^= (a[i] | orb);
            }

            if ((n & 1) == 1) {
                out.println(xor + " " + ans);
            } else {
                out.println(ans + " " + xor);
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