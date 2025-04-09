import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Math.min;
//import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    //@FunctionalInterface
    //interface Help {
    //    void f(int a[], int i, int j);
    //}

    void solve() throws IOException {
        char []s = nextToken().toCharArray();
        int n = s.length;
        int ans = 0;
        int i = n - 1;
        while (s[i] == '0') {
            i--;
            ans++;
        }
        for (int j = 0; j < i; j++) if(s[j] != '0') ans++;
        out.println(ans);

    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new B().solve();
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