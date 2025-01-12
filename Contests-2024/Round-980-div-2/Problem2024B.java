import java.io.*;
import java.util.*;

public class Problem2024B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            long K = Long.parseLong(nextToken());
            long A[] = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(nextToken());
            }

            Arrays.sort(A);
            long ans = 0;

            for (int i = 0, p = 0; i < N; i++) {
                A[i] -= p;
                if (A[i] * (N - i) >= K) {
                    ans += K;
                    break;
                }
                ans += A[i] * (N - i) + 1;
                K -= A[i] * (N - i);
                p += A[i];
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
}