import java.io.*;
import java.util.*;

public class Problem2030C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            int N = Integer.parseInt(nextToken());
            char[] str = nextToken().toCharArray();

            if (str[0] == '1' || str[N - 1] == '1') {
                out.println("YES");
                continue;
            }
            boolean flag = false;
            for (int i = 1; i < N - 1; i++) {
                if (str[i] == '1' && str[i + 1] == '1') {
                    out.println("YES");
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;
            out.println("NO");
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