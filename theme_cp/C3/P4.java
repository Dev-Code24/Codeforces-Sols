import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P4 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = parseInt(nextToken()), k = parseInt(nextToken()), s = 0;
        for (int i = 0; i < n; i++) {
            int x = parseInt(nextToken());
            s += x;
        }

        for (int ans = 0;; ans++) {
            int a = 2 * (s + ans * k);
            int b = (2 * k - 1) * (ans + n);

            if (a >= b) {
                out.println(ans);
                break;
            }
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