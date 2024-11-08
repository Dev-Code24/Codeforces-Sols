import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem2036C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = parseInt(nextToken());

        while (T-- > 0) {
            char[] in = nextToken().toCharArray();
            int n = in.length;
            int Q = parseInt(nextToken());
            long count = 0;

            for (int i = 0; i <= n - 4; i++) {
                if (calc(in, i))
                    count++;
            }

            for (int q = 0; q < Q; q++) {
                int i = parseInt(nextToken()) - 1;
                int v = parseInt(nextToken());

                if (in[i] != (char) ('0' + v)) {
                    boolean before = calc(in, i - 3) || calc(in, i - 2) || calc(in, i - 1)
                            || calc(in, i);
                    in[i] = (char) ('0' + v);
                    boolean after = calc(in, i - 3) || calc(in, i - 2) || calc(in, i - 1)
                            || calc(in, i);
                    count += (after ? 1 : 0) - (before ? 1 : 0);
                }

                out.println(count > 0 ? "YES" : "NO");
            }
        }

        out.flush();
        out.close();
        br.close();
    }

    private static boolean calc(char[] in, int i) {
        if (i < 0 || i >= in.length - 3)
            return false;
        return in[i] == '1' && in[i + 1] == '1' && in[i + 2] == '0' && in[i + 3] == '0';
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
