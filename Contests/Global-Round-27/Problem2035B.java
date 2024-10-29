import java.io.*;
import java.util.*;

public class Problem2035B {
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
        if (N < 2) {
            out.println(-1);
        } else {
            if ((N & 1) == 1) {
                if (N == 3) {
                    out.println(-1);
                } else {
                    String ans = "6366";
                    String temp = "3";
                    while (temp.length() < (N - 4)) {
                        temp += temp;
                    }
                    out.println(temp.substring(0, N - 4) + ans);
                }
            } else {
                String ans = "66";
                String temp = "3";
                while (temp.length() < (N - 2)) {
                    temp += temp;
                }
                out.println(temp.substring(0, N - 2) + ans);
            }
        }
    }
}