import java.io.*;
import java.util.*;
import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;

public class Problem2005A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            StringBuilder ans = new StringBuilder();
            int q = n / 5, r = n % 5;
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= q + min(r, 1); j++) {
                    ans.append(vowels[i - 1]);
                }
                r -= r > 0 ? 1 : 0;
            }
            out.println(ans.toString());
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
