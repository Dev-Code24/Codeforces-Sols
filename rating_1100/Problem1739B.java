import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1739B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int[] d = new int[n + 1];

            for (int j = 1; j <= n; j++) {
                d[j] = parseInt(nextToken());
            }

            int a = d[1], f = -1;

            for (int g = 2; g <= n; g++) {
                if (a - d[g] < 0 || d[g] == 0) {
                    a = a + d[g];
                } else {
                    out.println(-1);
                    f = 1;
                    break;
                }
            }

            if (f != 1) {
                int temp = d[0];
                for (int j = 1; j <= n; j++) {
                    out.print((d[j] + temp) + " ");
                    temp = temp + d[j];
                }
                out.println();
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