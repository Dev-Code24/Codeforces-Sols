import java.io.*;
import java.util.*;
import java.util.function.LongUnaryOperator;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.min;

public class Problem1902B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int tc = Integer.parseInt(nextToken());
        while (tc-- > 0) {
            int n = parseInt(nextToken());
            long P = parseLong(nextToken()); // min points needed
            int l = parseInt(nextToken()), t = parseInt(nextToken());

            int totTasks = (n + 6) / 7;
            LongUnaryOperator calc = (long k) -> (k * l + min(2 * k, totTasks) * t);

            int lo = 0, hi = n;
            int ans = n;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (calc.applyAsLong(mid) >= P) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            out.println(n - ans);

        }
        out.flush();
        out.close();
        br.close();
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}