import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P3 {
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

            Arrays.sort(a);
            if (a[0] == a[n - 1]) {
                out.println((long) n * (long) (n - 1));
                continue;
            }

            long mx = 0, mn = 0;
            for (int i = n - 1; i >= 0; i--) {
                mn += a[i] == a[n - 1] ? 1 : 0;
                mx += a[i] == a[0] ? 1 : 0;
            }

            out.println(2L * mx * mn);
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