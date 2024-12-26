import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Problem2044D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());

            int a[] = new int[n + 1], b[] = new int[n];
            for (int i = 0; i < n; i++) {
                int x = parseInt(nextToken());
                if (a[x] == 0) {
                    b[i] = x;
                    a[x] = 1;
                }
            }

            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                if (a[i] == 0) {
                    q.offer(i);
                }
            }

            for (int i = 0; i < n; i++) {
                if (b[i] == 0) {
                    b[i] = q.poll();
                }
            }

            for (int i = 0; i < n; i++) {
                out.print(b[i] + " ");
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