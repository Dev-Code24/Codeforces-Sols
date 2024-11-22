import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

public class Problem327A {
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
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int local = 0;
                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) {
                        local += (1 - a[k] == 1) ? 1 : 0;
                    } else {
                        local += a[k] == 1 ? 1 : 0;
                    }
                }
                mx = max(mx, local);
            }
        }

        out.println(mx);

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