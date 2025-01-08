import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1903B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int m[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = parseInt(nextToken());
                }
            }

            int a[] = new int[n];
            Arrays.fill(a, (1 << 30) - 1);
            boolean b = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        continue;
                    a[i] &= m[i][j];
                    a[j] &= m[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        continue;
                    if (m[i][j] != (a[i] | a[j])) {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    break;
                }
            }

            if (!b) {
                out.println("YES");
                for (int e : a) {
                    out.print(e + " ");
                }
                out.println();
            } else {
                out.println("NO");
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