import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Problem1821B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n], b[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = parseInt(nextToken());
            for(int i = 0; i < n; i++) b[i] = parseInt(nextToken());

            int l = 0, r = n - 1;

            while(l < n && a[l] == b[l]) l++;
            while(l - 1 >= 0 && b[l] >= b[l - 1]) l--;

            while(r >= 0 && a[r] == b[r]) r--;
            while(r + 1 < n && b[r] <= b[r + 1]) r++;

            out.println(l + 1 + " " + (r + 1));
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