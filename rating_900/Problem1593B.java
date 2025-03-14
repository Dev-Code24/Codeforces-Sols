import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1593B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        char in[] = nextToken().toCharArray();
        int n = in.length,  ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(in[i] == '0' && in[j] == '0') ans = n - 2 - i;
                if(in[i] == '5' && in[j] == '0') ans = n - 2 - i;
                if(in[i] == '2' && in[j] == '5') ans = n - 2 - i;
                if(in[i] == '7' && in[j] == '5') ans = n - 2 - i;
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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