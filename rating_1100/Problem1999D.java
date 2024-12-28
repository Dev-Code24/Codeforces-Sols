import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1999D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            char s[] = nextToken().toCharArray();
            char t[] = nextToken().toCharArray();
            int n = s.length, m = t.length;
            int i = 0, j = 0;
            while (i < n && j < m) {
                if (s[i] == t[j] || s[i] == '?') {
                    s[i] = t[j];
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            for (int k = 0; k < n; k++) {
                if (s[k] == '?') {
                    s[k] = 'a';
                }
            }
            if (i == n && j != m) {
                out.println("NO");
                continue;
            }
            if (j == m) {
                out.println("YES");
                out.println(new String(s));
                continue;
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