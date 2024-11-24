import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem474B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = parseInt(nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
        }
        int aa[] = new int[n];
        aa[0] = a[0];
        for (int i = 1; i < n; i++) {
            aa[i] = aa[i - 1] + a[i];
        }

        int m = parseInt(nextToken());
        Arrays.sort(aa);
        for (int i = 0; i < m; i++) {
            int q = parseInt(nextToken());
            int found = Arrays.binarySearch(aa, q);
            if (found < 0) {
                found = -1 - found;
            }
            if (found >= n - 1) {
                out.println(n);
            } else {
                // 2 9 12 16 25
                out.println(found + 1);
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