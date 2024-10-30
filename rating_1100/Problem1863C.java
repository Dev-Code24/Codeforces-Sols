import java.io.*;
import java.util.*;

public class Problem1863C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), K = Integer.parseInt(nextToken());
            Long a[] = new Long[N + 1];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                a[i] = Long.parseLong(nextToken());
                sum += a[i];
            }

            a[N] = ((long) N * (long) (N + 1) / 2) - sum;

            K = K % (N + 1);
            if (K > 0) {
                Long[] rotated = new Long[N + 1];
                System.arraycopy(a, N + 1 - K, rotated, 0, K);
                System.arraycopy(a, 0, rotated, K, N + 1 - K);
                a = rotated;
            }

            for (int i = 0; i < N; i++) {
                out.print(a[i] + " ");
            }
            out.println();
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
