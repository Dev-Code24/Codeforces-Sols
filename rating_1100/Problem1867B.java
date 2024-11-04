import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1867B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = parseInt(nextToken());
            char in[] = nextToken().toCharArray();
            char t[] = new char[N + 1];
            Arrays.fill(t, '0');

            int ans = 0, max1 = 0, max2 = 0;

            for (int i = 0; i <= N / 2 - 1; i++) {
                if (in[i] == in[N - i - 1]) {
                    max2++;
                } else {
                    ans++;
                }
            }

            if (N % 2 == 1) {
                max1++;
            }

            for (int i = 0; i <= max2; i++) {
                for (int j = 0; j <= max1; j++) {
                    t[ans + i * 2 + j] = '1';
                }
            }
            for (int i = 0; i < N + 1; i++) {
                out.print(t[i]);
            }
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