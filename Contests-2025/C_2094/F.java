import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
//import static java.lang.Math.min;
//import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class F {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    //@FunctionalInterface
    //interface Help {
    //    void f(int a[], int i, int j);
    //}

    void solve() throws IOException {
        int n = parseInt(nextToken()), m = parseInt(nextToken()), k = parseInt(nextToken());

        if (m % k != 0) {
            int num = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (num == k + 1) num = 1;
                    out.print(num++ + " ");
                }
                out.println();
            }
        } else {
            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= k; i++) q.offer(i);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.print(q.peek() + " ");
                    q.offer(q.poll());
                }
                out.println();
                q.offer(q.poll());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new F().solve();
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