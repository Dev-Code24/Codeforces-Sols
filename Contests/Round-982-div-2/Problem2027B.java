import java.io.*;
import java.util.*;
import static java.lang.Math.max;

public class Problem2027B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), A[] = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(nextToken());

            int best = 0;
            for (int i = 0; i < N; i++) {
                int curr = 0;
                for (int j = i; j < N; j++) {
                    curr += A[j] <= A[i] ? 1 : 0;
                }
                best = max(best, curr);
            }

            out.println(N - best);
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