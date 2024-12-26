import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2050B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long a[] = new long[n];
            long ev = 0, odd = 0;
            int cntev = 0, cntodd = 0;
            for (int i = 1; i <= n; i++) {
                a[i - 1] = parseInt(nextToken());
                if (i % 2 == 0) {
                    ev += a[i - 1];
                    cntev++;
                } else {
                    odd += a[i - 1];
                    cntodd++;
                }
            }

            if ((ev / cntev != odd / cntodd) || ev % cntev != 0 || odd % cntodd != 0) {
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