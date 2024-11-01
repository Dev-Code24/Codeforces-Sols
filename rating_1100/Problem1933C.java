import java.io.*;
import java.util.*;

public class Problem1933C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            long A = Integer.parseInt(nextToken()), B = Integer.parseInt(nextToken()),
                    L = Integer.parseInt(nextToken());

            var ans = new TreeSet<Long>();
            for (int i = 0; i <= 34; i++) {
                long x = L;
                boolean fail = false;
                for (int j = 0; j < i; j++) {
                    if (x % A > 0) {
                        fail = true;
                        break;
                    }
                    x /= A;
                }
                if (fail)
                    break;
                while (true) {
                    ans.add(x);
                    if (x % B > 0) {
                        break;
                    }
                    x /= B;
                }
            }

            out.println(ans.size());

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