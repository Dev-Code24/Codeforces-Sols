import java.io.*;
import java.util.*;

public class Problem2027A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            solve();
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

    private static void solve() throws IOException {
        int N = Integer.parseInt(nextToken());
        int widths[] = new int[N], heights[] = new int[N];
        for (int i = 0; i < N; i++) {
            int w = Integer.parseInt(nextToken()), h = Integer.parseInt(nextToken());
            heights[i] = h;
            widths[i] = w;
        }
        Arrays.sort(heights);
        Arrays.sort(widths);
        int rest = heights[0] + widths[0];
        for (int i = 1; i < N; i++) {
            rest += heights[i] - heights[i - 1] + widths[i] - widths[i - 1];
        }

        out.println(heights[N - 1] + widths[N - 1] + rest);
    }
}