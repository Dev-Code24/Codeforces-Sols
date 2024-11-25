import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1384A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }

            // a[i] is the length of the LCP of s[i] and s[i + 1]

            StringBuilder s = new StringBuilder("a");
            while (s.length() < 200) {
                s.append(s);
            }
            s = new StringBuilder(s.substring(0, 200));

            out.println(s.toString());
            for (int i = 1; i < n + 1; i++) {
                for (int j = a[i - 1]; j < 200; j++) {
                    if (s.charAt(j) == 'a')
                        s.setCharAt(j, 'b');
                    else
                        s.setCharAt(j, 'a');
                }
                out.println(s.toString());
            }

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