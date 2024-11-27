import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1352B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            if (k > n) {
                out.println("NO");
                continue;
            }

            if ((n & 1) == 0) {
                if ((k & 1) == 0) {
                    int x = n - (k - 1);
                    out.println("YES");
                    out.print(x + " ");
                    for (int i = 0; i < k - 1; i++) {
                        out.print(1 + (i == k - 2 ? "\n" : " "));
                    }
                } else {
                    int x = n - (2 * k - 2);
                    if (x > 0) {
                        out.println("YES");
                        out.print(x + " ");
                        for (int i = 0; i < k - 1; i++) {
                            out.print(2 + (i == k - 2 ? "\n" : " "));
                        }
                    } else {
                        out.println("NO");
                    }
                }
            } else {
                if ((k & 1) == 0) {
                    // odd - odd = even
                    // odd - even = odd
                    // x = n - (k - 2) --> odd, nums left to print -> (k - 1)
                    out.println("NO");
                } else {
                    // x = n - (k - 1), odd, remaining = k - 1 elems
                    // 11 3
                    // x = 11 - (3 - 1) = 9, remaining = 2
                    int x = n - (k - 1);
                    out.println("YES");
                    out.print(x + " ");
                    for (int i = 0; i < k - 1; i++) {
                        out.print(1 + (i == k - 2 ? "\n" : " "));
                    }
                }
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