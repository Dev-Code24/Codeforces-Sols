import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            // a[i] % i != a[j] % j
            var set = new TreeSet<Integer>();
            set.add(0);
            out.print(1 + " ");
            int num = 2;
            for (int i = 2; i <= n; i++) {
                for (; num <= 100; num++) {
                    int last = set.last();
                    if (num % (i) == (last + 1)) {
                        out.print(num + " ");
                        set.add(num % (i));
                        break;
                    }
                }
            }
            out.println();
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