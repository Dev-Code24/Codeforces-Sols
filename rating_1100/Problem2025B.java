import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2025B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static final int mod = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = parseInt(nextToken());
        for (int i = 0; i < t; i++) {
            int _ = parseInt(nextToken());
        }

        int k[] = new int[t];
        for (int i = 0; i < t; i++) {
            k[i] = parseInt(nextToken());
        }
        int mx = Arrays.stream(k).max().getAsInt();
        int k2s[] = new int[mx + 1];
        k2s[0] = 1;
        for (int i = 1; i < k2s.length; i++) {
            k2s[i] = (2 * k2s[i - 1]) % mod;
        }

        for (int i = 0; i < t; i++) {
            out.println(k2s[k[i]]);
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