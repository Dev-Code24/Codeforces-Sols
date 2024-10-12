import java.io.*;
import java.util.*;

public class Problem1984C1 {
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
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(nextToken());
            }

            long C = 0, mn = 0;
            for (int i = 0; i < N; i++) {
                C += A[i];
                mn = Math.min(C, mn);
            }

            out.println(C - 2 * mn);
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