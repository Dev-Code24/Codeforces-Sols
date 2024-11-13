import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Problem1553C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            char in[] = nextToken().toCharArray();
            int ans = 9;

            {
                int cnt0 = 0, cnt1 = 0;
                for (int i = 0; i < 10; ++i) {
                    if (i % 2 == 0)
                        cnt0 += in[i] != '0' ? 1 : 0;
                    else
                        cnt1 += in[i] == '1' ? 1 : 0;
                    if (cnt0 > cnt1 + (10 - i) / 2)
                        ans = min(ans, i);
                    if (cnt1 > cnt0 + (9 - i) / 2)
                        ans = min(ans, i);
                }
            }
            {
                int cnt0 = 0, cnt1 = 0;
                for (int i = 0; i < 10; ++i) {
                    if (i % 2 == 0)
                        cnt0 += in[i] == '1' ? 1 : 0;
                    else
                        cnt1 += in[i] != '0' ? 1 : 0;

                    if (cnt0 > cnt1 + (10 - i) / 2)
                        ans = min(ans, i);
                    if (cnt1 > cnt0 + (9 - i) / 2)
                        ans = min(ans, i);
                }
            }
            out.println(ans + 1);
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