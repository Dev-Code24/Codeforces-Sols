import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1783B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    @FunctionalInterface
    interface Helper {
        int[] fn(int arr[]);
    }
    static void solve() throws IOException {
        int n = parseInt(nextToken());
        
        int a[][] = new int[n][n];
        int l = 1, r = n * n;
        int t = 0;

        Helper help = (arr) -> {
            var list = new ArrayList<Integer>(n);
            for(int i : arr) list.add(i);
            Collections.reverse(list);
            int res[] = new int[n];
            for (int i = 0; i < n; i++) res[i] = list.get(i);
            return res;
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(t == 0) a[i][j] = l++;
                else a[i][j] = r--;
                t ^= 1;
            }
            
            if ((i & 1) == 1) {
                a[i] = help.fn(a[i]);
            }
            for(int k : a[i]) out.print(k + " ");
            out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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