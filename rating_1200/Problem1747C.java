import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1747C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void alice() {
        out.println("Alice");
    }

    static void bob() {
        out.println("Bob");
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());
            int mn = (int)1e9;
            for(int i = 1; i < n; i++)  mn = Math.min(a[i],mn);
            if(a[0] > a[1]) {
                alice();
            }else {
                bob();
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

