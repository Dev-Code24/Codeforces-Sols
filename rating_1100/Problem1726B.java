import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1726B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int MAX = (int) 1e5 + 2;
        String ans = "1 ";
        while (ans.length() < 2 * MAX) {
            ans += ans;
        }
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = parseInt(nextToken()), M = parseInt(nextToken());

            if (M < N) {
                out.println("NO");
            } else {
                int sum = 0;
                if (N % 2 == 1) {
                    sum = N - 1;
                    String res = ans.substring(0, 2 * N - 2) + (M - sum);
                    out.println("YES\n" + res);
                } else if (N % 2 == 0 && M % 2 == 0) {
                    // both even and M > N
                    sum = N - 2;
                    String res = ans.substring(0, 2 * N - 4) + ((M - sum) / 2) + " " + ((M - sum) / 2);
                    out.println("YES\n" + res);
                } else {
                    out.println("NO");
                }
            }
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