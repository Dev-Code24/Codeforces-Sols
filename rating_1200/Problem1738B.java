import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1738B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            long s[] = new long[n + 1];
            for (int i = n - k + 1; i <= n; i++) s[i] = parseInt(nextToken());

            if (k == 1) {
                out.println("YES");
                continue;
            }
            long a[] = new long[n + 1];
            for (int i = n - k + 2; i <= n; i++) a[i] = s[i] - s[i - 1];

            boolean f = false;
            for(int i = n - k + 2; i < n; i++) {
                if(a[i + 1] < a[i]){
                    f = true;
                    break;
                }
            }

            if(f) {
                out.println("NO");
            }else {
                if(s[n - k + 1] > (n - k + 1) * a[n - k + 2]) {
                    out.println("NO");
                    continue;
                }
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