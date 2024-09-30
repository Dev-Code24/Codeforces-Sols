import java.io.*;
import java.util.*;

public class Problem2020A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static long n, k;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            n = Long.parseLong(nextToken());
            k = Long.parseLong(nextToken());

            if (k == 1) {
                out.println(n);
                continue;
            }

            int ans = 0;
            while (n > 0) {
                ans += n % k;
                n /= k;
            }
            out.println(ans);
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