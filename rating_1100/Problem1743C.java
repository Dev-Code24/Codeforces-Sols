
import java.io.*;
import java.util.*;
import static java.lang.Math.min;

public class Problem1743C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            String S = "0" + nextToken();
            int[] A = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                A[i] = Integer.parseInt(nextToken());
            }

            int ans = 0;
            int i = 0;
            while (i <= N) {
                int mn = A[i], sm = A[i];
                int j = i + 1;
                while (j <= N && S.charAt(j) == '1') {
                    mn = min(mn, A[j]);
                    sm += A[j];
                    j++;
                }
                ans += sm - mn;
                i = j;
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