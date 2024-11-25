import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class Problem1392C {
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
            long sum = 0;
            for (int i = 0; i + 1 < n; i++) {
                sum += max(a[i] - a[i + 1], 0);
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