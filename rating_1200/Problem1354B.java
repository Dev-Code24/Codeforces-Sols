import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Problem1354B {
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
            int ternary[] = { 0, 0, 0 };
            int ans = n + 1;

            for (int l = 0, r = 0; l < n; l++) {
                while (min(ternary[0], min(ternary[1], ternary[2])) <= 0 && r < n) {
                    ternary[s[r++] - '1']++;
                }
                if (min(ternary[0], min(ternary[1], ternary[2])) <= 0)
                    break;
                ans = min(ans, r - l);
                ternary[s[l] - '1']--;
            }

            if (ans == n + 1)
                ans = 0;
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