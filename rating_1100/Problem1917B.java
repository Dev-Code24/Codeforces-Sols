import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1917B {
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
            int alp[] = new int[26];

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (alp[s[i] - 'a'] == 0) {
                    ans += n - i;
                    alp[s[i] - 'a'] = 1;
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