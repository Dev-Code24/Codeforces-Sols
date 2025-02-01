import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.ceilDiv;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
import static java.lang.Math.abs;

public class Problem1945C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n, pref[];

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            char s[] = nextToken().toCharArray();

            int pref[] = new int[n + 1];
            for(int i = 1; i <= n; i++) pref[i] = pref[i - 1] + s[i - 1] - '0';

            int ans = -1000;
            for(int i = 0; i < n + 1; i++){
                if((i - pref[i]) >= (i + 1) / 2 && (pref[n] - pref[i]) >= (n - i + 1) /2 && abs(2 * ans - n) > abs(2*i - n))
                        ans = i;
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