import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class Problem1995B1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long m = Long.parseLong(nextToken());
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                long x = parseInt(nextToken());
                a[i] = x;
            }
            Arrays.sort(a);

            long sum = 0, curr = 0;
            for (int i = 0, j = 0; j < n; j++) {
                curr += a[j];
                while (i < n && (a[j] - a[i] > 1 || curr > m)) {
                    curr -= a[i];
                    i++;
                }
                if (curr <= m) {
                    sum = max(curr, sum);
                }
            }

            out.println(sum);

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