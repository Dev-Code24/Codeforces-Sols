import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1694B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            char s[] = nextToken().toCharArray();
            long ans = n;
            if (n >= 2) {
                for (int i = n; i > 1; i--) {
                    if (s[i - 1] != s[i - 2]) {
                        ans += (i - 1);
                    }
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