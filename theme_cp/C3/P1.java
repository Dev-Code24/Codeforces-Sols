import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
import static java.lang.Math.min;

public class P1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = parseInt(nextToken()), m = parseInt(nextToken()), k = parseInt(nextToken());

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (a[i - 1] > 0 && a[i - 1] <= k) {
                ans = min(ans, abs(i - m));
            }
        }

        out.println(ans * 10);

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