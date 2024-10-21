import java.io.*;
import java.util.*;

public class Problem2024A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            long A = Integer.parseInt(nextToken()), B = Integer.parseInt(nextToken());

            if (A >= B) {
                out.println(A);
                continue;
            }
            if (2 * A < B) {
                out.println(0);
                continue;
            }

            out.println(2*A - B);

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