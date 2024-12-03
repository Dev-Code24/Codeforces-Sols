import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class P4 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int diags[] = new int[2 * n + 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int a = parseInt(nextToken());
                    int idx = i - j + n;
                    diags[idx] = min(a, diags[idx]);
                }
            }
            int ans = Arrays.stream(diags).sum();
            out.println(-ans);

        }

        out.flush();
        out.close();
        br.close();
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
// -3 -1 -5 -4