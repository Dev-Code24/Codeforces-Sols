import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Problem2050C {
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
            long sum = 0;
            int cnt[] = new int[2]; // cnt the number of 2s and 3s
            for (int i = 0; i < n; i++) {
                sum += s[i] - '0';
                if (s[i] == '2') {
                    cnt[0]++;
                }
                if (s[i] == '3') {
                    cnt[1]++;
                }
            }
            int f = -1;
            for (int i = 0; i <= min(cnt[0], 8); i++) {
                int ts = 2 * i;
                for (int j = 0; j <= min(cnt[1], 8); j++) {
                    ts += 6 * j;
                    if ((sum + ts) % 9 == 0) {
                        f = 1;
                        break;
                    }
                    ts = 2 * i;
                }
                if (f == 1) {
                    break;
                }
            }

            if (f == 1) {
                out.println("YES");
            } else {
                out.println("NO");
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
