import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1905B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = parseInt(nextToken());
        while (T-- > 0) {
            int N = parseInt(nextToken());
            int freq[] = new int[N + 1];
            for (int i = 0; i < N - 1; i++) {
                int a = parseInt(nextToken()), b = parseInt(nextToken());
                freq[a]++;
                freq[b]++;
            }

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                ans += (freq[i] == 1) ? 1 : 0;
            }
            out.println((ans + 1) / 2);
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