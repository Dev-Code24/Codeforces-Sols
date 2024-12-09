import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1988B {
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

            int l = 0, r = 0;
            int cnt0 = 0, cnt1 = 0;
            while (r < n) {
                while (r < n && s[r] == '0') {
                    r++;
                }
                if (r != l) {
                    cnt0 += 1;
                }
                l = r;
                while (r < n && s[r] == '1') {
                    r++;
                    cnt1 += 1;
                }
                l = r;
            }
            if (cnt0 >= cnt1) {
                out.println("NO");
            } else {
                out.println("YES");
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