import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class Problem1437B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());

        while (TC-- > 0) {
            int n = parseInt(nextToken());
            String s = nextToken();
            int ans = Integer.MAX_VALUE;

            {
                int cnt = 0;
                String temp = "1" + s + "0";
                for (int i = 0; i + 1 < n + 2; i++) {
                    if (temp.charAt(i) == temp.charAt(i + 1)) {
                        cnt++;
                    }
                }
                ans = min(ans, cnt / 2);
            }

            {
                int cnt = 0;
                String temp = "0" + s + "1";
                for (int i = 0; i + 1 < n + 2; i++) {
                    if (temp.charAt(i) == temp.charAt(i + 1)) {
                        cnt++;
                    }
                }
                ans = min(ans, cnt / 2);
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
