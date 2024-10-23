import java.io.*;
import java.util.*;

public class Problem1957B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken()), K = Integer.parseInt(nextToken());

            if (N == 1) {
                out.println(K);
                continue;
            }

            int kk = 32 - Integer.numberOfLeadingZeros(K);
            int num = (1 << (kk - 1)) - 1;
            out.print(num + " " + (K - num) + " ");
            for (int i = 0; i < N - 2; i++)
                out.print(0 + " ");
            out.println();

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