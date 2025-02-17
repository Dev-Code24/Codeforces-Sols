import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

        int freq[] = new int[n + 1];
        for (int i : a) freq[i]++;

        int len[] = new int[n + 1];
        len[0] = freq[a[0]] == 1 ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (freq[a[i]] == 1) len[i] = len[i - 1] + 1;
        }

        int mx = Arrays.stream(len).max().getAsInt();
        if (mx == 0) {
            out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (len[i] == mx) {
                out.println(i - len[i] + 2 + " " + (i + 1));
                return;
            }
        }
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