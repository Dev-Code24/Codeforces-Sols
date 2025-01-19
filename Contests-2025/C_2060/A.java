import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int a[];
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            a = new int[5];
            a[0] = parseInt(nextToken());
            a[1] = parseInt(nextToken());
            a[3] = parseInt(nextToken());
            a[4] = parseInt(nextToken());

            a[2] = a[0] + a[1];
            int ans1 = 0;
            for(int i = 0; i < 3; i++) {
                if(a[i] + a[i + 1] == a[i + 2]) ans1++;
            }

            a[2] = a[4] - a[3];
            int ans2 = 0;
            for(int i = 1; i + 2 < 5; i++) {
                if(a[i] + a[i + 1] == a[i + 2]) ans2++;
            }
            // 1 2 3 4 5
            out.println(Math.max(ans1,ans2));

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