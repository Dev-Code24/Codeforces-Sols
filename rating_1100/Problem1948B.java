import java.io.*;
import java.util.*;

public class Problem1948B {
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
            List<Integer> b = new ArrayList<>();
            b.add(A[N - 1]);
            for (int i = N - 2; i >= 0; i--) {
                if (A[i] > b.get(b.size() - 1)) {
                    b.add(A[i] % 10);
                    b.add(A[i] / 10);
                } else {
                    b.add(A[i]);
                }
            }
            boolean sorted = true;
            for (int i = 1; i < b.size(); i++) {
                if (b.get(i) > b.get(i - 1)) {
                    sorted = false;
                    break;
                }
            }
            out.println(sorted ? "YES" : "NO");

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