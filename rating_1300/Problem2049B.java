import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem2049B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            char s[] = nextToken().toCharArray();

            int a[] = new int[n + 1];
            int curr = 1;
            for (int i = 1; i <= n; i++) {
                if (s[i - 1] != 'p' && i + 1 <= n)
                    continue;
                int j = i;
                while (j > 0 && a[j] == 0) {
                    a[j] = curr;
                    curr++;
                    j--;
                }
            }
            boolean b = true;
            int sum = 0;
            for (int i = n; i >= 1; i--) {
                sum += a[i];
                if (s[i - 1] != 's')
                    continue;
                int l = n - i + 1;
                if (l * (l + 1) / 2 != sum)
                    b = false;
            }

            out.println(b ? "YES" : "NO");
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