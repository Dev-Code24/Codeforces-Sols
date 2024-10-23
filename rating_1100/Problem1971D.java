import java.io.*;
import java.util.*;

public class Problem1971D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            char bs[] = nextToken().toCharArray();
            int n = bs.length;
            int res = 1;
            boolean ex = false;
            for (int i = 0; i + 1 < n; i++) {
                res += (bs[i] != bs[i + 1]) ? 1 : 0;
                ex |= (bs[i] == '0' && bs[i + 1] == '1');
            }

            out.println(res - (ex ? 1 : 0));

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