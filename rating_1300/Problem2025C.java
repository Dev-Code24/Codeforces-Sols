import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.abs;

public class Problem2025C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

            int ans = 0;
            Arrays.sort(a);

            for(int i = 0, j = 0; i < n; i++) {
                j = max(i,j);
                while(j + 1 < n && a[j + 1] - a[j] <= 1 && a[j + 1] - a[i] < k)  j += 1;
                ans = max(ans, j - i + 1);
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

// 10 10 10 11 11