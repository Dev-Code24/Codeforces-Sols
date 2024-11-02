import java.io.*;
import java.util.*;
import static java.lang.Math.max;

public class Problem1760E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(nextToken());
            }
            long ans = helper(A);
            for (int i = 0; i < N; i++) {
                if (A[i] == 0) {
                    A[i] = 1;
                    ans = max(ans, helper(A));
                    A[i] = 0;
                    break;
                }
            }
            for (int i = N - 1; i >= 0; i--) {
                if (A[i] == 1) {
                    A[i] = 0;
                    ans = max(ans, helper(A));
                    A[i] = 1;
                    break;
                }
            }
            out.println(ans);
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

    private static long helper(int a[]) {
        long zeroes = 0, ans = 0;
        for (int i = a.length - 1; i >= 0; --i) {
            if (a[i] == 0)
                ++zeroes;
            else
                ans += zeroes;
        }
        return ans;
    }
}