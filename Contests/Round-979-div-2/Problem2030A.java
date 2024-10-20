import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2030A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    private static void solve() throws IOException {
        int N = Integer.parseInt(nextToken());
        int A[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(nextToken());
        }

        Arrays.sort(A);
        A[0] = A[0] ^ A[N];
        A[N] = A[0] ^ A[N];
        A[0] = A[0] ^ A[N];

        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            mx = max(mx, A[i]);
            mn = min(mn, A[i]);
            ans += mx - mn;
        }

        out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            solve();
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