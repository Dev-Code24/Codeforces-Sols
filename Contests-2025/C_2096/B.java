import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.Math.max;
//import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    //@FunctionalInterface
    //interface Help {
    //    void f(int a[], int i, int j);
    //}
    int[] reverseSort(int arr[], int len) {
        var list = new ArrayList<Integer>(len);
        for (int i : arr) list.add(i);
        list.sort(Collections.reverseOrder());
        for (int i = 0; i < len; i++) arr[i] = list.get(i);

        return arr;
    }
    void solve() throws IOException {
        int n = parseInt(nextToken()), k = parseInt(nextToken());
        int l[] = new int[n], r[] = new int[n];
        for (int i = 0; i < n; i++) l[i] = parseInt(nextToken());
        for (int i = 0; i < n; i++) r[i] = parseInt(nextToken());

        int a[] = new int[n], b[] = new int[n];

        long y = 0;
        int m = k - 1;
        for (int i = 0; i < n; i++) {
            a[i] = max(l[i], r[i]);
            b[i] = min(l[i], r[i]);
            y += a[i];
        }

        b = reverseSort(b, n);

        for (int i = 0; i < m; i++) y += b[i];

        out.println(y + 1);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) new B().solve();
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