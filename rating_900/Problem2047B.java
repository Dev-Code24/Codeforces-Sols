import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem2047B {
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
            int f[] = new int[26];
            for (int i = 0; i < n; i++) {
                f[s[i] - 'a']++;
            }
            char mx = s[0], mn = s[0];

            for (int i = 0; i < 26; i++) {
                if (f[i] >= f[mx - 'a']) {
                    mx = (char) ('a' + i);
                }
                if (f[25 - i] <= f[mn - 'a'] && f[25 - i] > 0) {
                    mn = (char) ('a' + (25 - i));
                }
            }

            for (int i = 0; i < n; i++) {
                if (s[i] == mn) {
                    s[i] = mx;
                    break;
                }
            }
            out.println(new String(s));
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