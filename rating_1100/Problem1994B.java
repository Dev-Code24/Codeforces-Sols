import java.io.*;
import java.util.*;

public class Problem1994B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int Tc = Integer.parseInt(nextToken());
        while (Tc-- > 0) {
            int N = Integer.parseInt(nextToken());
            String S = nextToken(), T = nextToken();
            int i = 0, j = 0;
            while (i < N) {
                if (S.charAt(i) == '1')
                    break;
                i++;
            }
            while (j < N) {
                if (T.charAt(j) == '1')
                    break;
                j++;
            }

            out.println(i > j ? "NO" : "YES");

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