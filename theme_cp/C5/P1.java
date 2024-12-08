import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int s = 0;
            for (int i = 0, a = 0; i < n; i++) {
                a = parseInt(nextToken());
                s += a;
            }
            int ans = 0;
            if (s != n) {
                if (s < n) {
                    ans = 1;
                } else {
                    ans = s - n;
                }
            }

            out.println(ans);

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