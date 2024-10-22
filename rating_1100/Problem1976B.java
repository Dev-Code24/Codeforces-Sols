import java.io.*;
import java.util.*;
import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class Problem1976B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            long[] A = new long[N], B = new long[N + 1];
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(nextToken());
            for (int i = 0; i <= N; i++)
                B[i] = Integer.parseInt(nextToken());

            long sum = 0, extra = Long.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                sum += abs(A[i] - B[i]);
                extra = min(extra, abs(A[i] - B[N]));
                extra = min(extra, abs(B[i] - B[N]));
                if (min(A[i], B[i]) <= B[N] && max(A[i], B[i]) >= B[N])
                    extra = 0;
            }
            out.println(sum + extra + 1);
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