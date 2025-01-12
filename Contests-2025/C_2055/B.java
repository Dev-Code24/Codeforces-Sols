import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n], b[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());
            for (int i = 0; i < n; i++) b[i] = parseInt(nextToken());

            int i = 0;
            while (i < n && a[i] >= b[i]) i++;

            if (i == n) {
                out.println("YES");
                continue;
            }
            boolean f = false;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (a[j] - (b[i] - a[i]) < b[j]) {
                    f = true;
                    break;
                }

            }
            if (f) {
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