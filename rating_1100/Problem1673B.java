import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1673B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            char s[] = nextToken().toCharArray();
            int n = s.length;

            int cnt[] = new int[26];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (cnt[s[i] - 'a'] < 1) {
                    sb.append(s[i]);
                    cnt[s[i] - 'a']++;
                } else {
                    break;
                }
            }
            int m = sb.length();
            if (sb.length() == n) {
                out.println("YES");
            } else {
                int f = -1;

                for (int i = 0; i < n; i++) {
                    if (s[i] != sb.charAt(i % m)) {
                        f = 1;
                        break;
                    }
                }

                if (f == 1) {
                    out.println("NO");
                } else {
                    out.println("YES");
                }
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