import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem1811C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int b[] = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                b[i] = parseInt(nextToken());
            }

            out.print(b[0] + " ");
            for (int i = 0; i < n - 2; i++) {
                out.print(min(b[i], b[i + 1]) + " ");
            }
            out.println(b[n - 2]);
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