import java.io.*;
import java.util.*;

public class Problem1942B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            int A[] = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(nextToken());

            boolean has[] = new boolean[N + 1];
            int mex = 0, p[] = new int[N];

            for (int i = 0; i < N; i++) {
                if (A[i] >= 0) {
                    p[i] = mex;
                } else {
                    p[i] = mex - A[i];
                }
                has[p[i]] = true;
                while (has[mex] && mex + 1 <= N)
                    mex++;
            }

            for (int i : p)
                out.print(i + " ");
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