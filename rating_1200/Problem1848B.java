import java.io.*;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.abs;

public class Problem1848B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n, k, c[];

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            k = parseInt(nextToken());
            c = new int[n];
            for (int i = 0; i < n; i++) c[i] = parseInt(nextToken());

            int last[] = new int[k];
            Arrays.fill(last, -1);
            int max1[] = new int[k], max2[] = new int[k];
            for (int i = 0; i < n; i++) {
                int tt = i - last[c[i] - 1];
                if (max1[c[i] - 1] < tt) {
                    max2[c[i] - 1] = max1[c[i] - 1];
                    max1[c[i] - 1] = tt;
                } else if (tt > max2[c[i] - 1]) {
                    max2[c[i] - 1] = tt;
                }

                last[c[i] - 1] = i;
            }
            
            for (int i = 0; i < k; i++) {
                int tt = n - last[i];
                if (tt > max1[i]) {
                    max2[i] = max1[i];
                    max1[i] = tt;
                } else if (max2[i] < tt) {
                    max2[i] = tt;
                }
            }

            int ans = (int) 1e9;
            for (int i = 0; i < k; i++) {
                ans = min(ans, max(max2[i], (max1[i] + 1 )/ 2));
            }
            out.println(ans - 1);
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