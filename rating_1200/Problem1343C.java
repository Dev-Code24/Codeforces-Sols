import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class Problem1343C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long curr = a[i];
                int j = i;
                while (j < n && sign(a[i]) == sign(a[j])) {
                    curr = max(curr, a[j]);
                    j++;
                }
                ans += curr;
                i = j - 1;
            }
            out.println(ans);
        }

        out.flush();
        out.close();
        br.close();
    }

    static long sign(long num) {
        return num < 0 ? -1L : 1L;
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}