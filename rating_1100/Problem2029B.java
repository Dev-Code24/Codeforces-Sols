import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2029B {
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
            char r[] = nextToken().toCharArray();
            int cnt1 = 0, cnt0 = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == '0') {
                    cnt0++;
                } else {
                    cnt1++;
                }
            }
            int f = -1;
            for (int i = 0; i < n - 1; i++) {
                if (cnt0 == 0 || cnt1 == 0) {
                    out.println("NO");
                    f = 1;
                    break;
                }
                if (r[i] == '0')
                    cnt1--;
                else
                    cnt0--;
            }
            if (f == 1) {
                continue;
            }
            out.println("YES");
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
