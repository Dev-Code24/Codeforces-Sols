import java.io.*;
import java.util.*;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
import static java.lang.Math.abs;

public class Problem2036A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

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

    private static void solve() throws IOException {
        int N = Integer.parseInt(nextToken());
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(nextToken());
        }
        for (int i = 1; i < N; i++) {
            int diff = abs(A[i] - A[i - 1]);
            if (diff != 5 && diff != 7) {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
    }
}