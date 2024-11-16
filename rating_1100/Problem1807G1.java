import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1807G1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), c[] = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = parseInt(nextToken());
            }

            Arrays.sort(c);
            if (c[0] > 1) {
                out.println("NO");
                continue;
            }
            int sum = 1, f = -1;

            for (int i = 2; i <= n; i++) {
                int el = c[i - 1];
                if (sum < el) {
                    out.println("NO");
                    f = 1;
                    break;
                }
                sum += el;
            }
            if (f == 1)
                continue;
            out.println("YES");
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