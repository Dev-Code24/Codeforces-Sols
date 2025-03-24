import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
//  Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

//  @FunctionalInterface
//    interface Help {
//        void f(int i);
//   }

    static void solve() throws IOException {
        int n = parseInt(nextToken()), k = parseInt(nextToken());
        char s[] = nextToken().toCharArray();
        char r[] = new StringBuilder(new String(s)).reverse().toString().toCharArray();

        if (new String(r).compareTo(new String(s)) > 0) {
            out.println("YES");
            return;
        }

        var set = new TreeSet<Character>();
        for (var i : s) set.add(i);

        if (set.size() > 1 && k > 0) {
            out.println("YES");
            return;
        }

        out.println("NO");
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