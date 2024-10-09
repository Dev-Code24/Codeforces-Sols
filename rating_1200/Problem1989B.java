import java.io.*;
import java.util.*;
// import java.math.*;

public class Problem1989B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int T = Integer.parseInt(nextToken());
        while (T-- > 0) {
            // to calculate the min possible length of the string, where
            char a[] = nextToken().toCharArray(); // this should be the substring
            char b[] = nextToken().toCharArray(); // this should be the subsequence

            int n = a.length, m = b.length;
            int max = 0;
            for (int i = 0; i < m; i++) {
                int cnt = 0;
                int h = i;
                for (int j = 0; j < n && h < m; j++) {
                    if (a[j] == b[h]) {
                        cnt++;
                        h++;
                    }
                }
                max = Math.max(max, cnt);
            }
            out.println(n + m - max);
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