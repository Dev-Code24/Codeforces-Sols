import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2056C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            // f(a) is the length of the longest subsequence  of a that is a palindrome
            // g(a) is the number of subsequences with length f(a)
            // g(a) > n, constraint

            for(int i = 1; i <= n; i++) {
                if(i % (n/2) == 0) out.print(1 + " ");
                else {
                    out.print(i == n ? i - 2 : i + " ");
                }
            }
            out.println();

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