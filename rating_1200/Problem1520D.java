import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1520D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            long ans = 0;
            var mp = new TreeMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int x = parseInt(nextToken());

                ans += mp.getOrDefault(x - i, 0);
                mp.put(x - i, mp.getOrDefault(x - i, 0) + 1);
            }
            out.println(ans);
        }

        out.flush();
        out.close();
        br.close();
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}