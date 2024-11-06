import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1884B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = parseInt(nextToken());
        while (T-- > 0) {
            int N = parseInt(nextToken());
            String in = nextToken();
            StringBuilder sb = new StringBuilder(in);
            sb.reverse();
            in = " " + sb.toString();

            int cnt = 0, k = 0;
            long pre[] = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                if (in.charAt(i) == '0') {
                    pre[++k] = cnt;
                } else {
                    cnt++;
                }
            }

            for (int i = 1; i <= k; i++)
                pre[i] += pre[i - 1];
            for (int i = 1; i <= k; i++)
                out.print(pre[i] + " ");
            for (int i = k + 1; i <= N; i++) {
                out.print(-1 + (i != N ? " " : "\n"));
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
