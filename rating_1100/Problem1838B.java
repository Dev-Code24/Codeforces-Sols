import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class Problem1838B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int N = (int) 2e5 + 5;
        int idx[] = new int[N];
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int n = Integer.parseInt(nextToken());
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(nextToken());
                idx[x] = i + 1;
            }

            if (idx[n] < min(idx[1], idx[2])) {
                out.println(idx[n] + " " + min(idx[1], idx[2]));
            } else if (idx[n] > max(idx[1], idx[2])) {
                out.println(idx[n] + " " + max(idx[1], idx[2]));
            } else {
                out.println(idx[1] + " " + idx[2]);
            }
        }
        out.flush();
        out.close();
        br.close();
    }

    private static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}