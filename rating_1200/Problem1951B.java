import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1951B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            k--;
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
            }

            int mc = a[k], mci = k;
            for (int i = 0; i < n; i++) {
                int x = a[i];
                if (x > mc && i < mci) {
                    mc = x;
                    mci = i;
                }
            }
            
            if (mci <= k) {
                swap(a, 0, k);
                int mx = a[0];
                int cnt1 = 0, cnt2 = 0;
                for (int i = 1; i < n; i++) {
                    mx = max(mx, a[i]);
                    if (mx == a[0]) {
                        cnt1++;
                    }
                }
                swap(a, 0, k);
                swap(a, mci, k);
                k = mci;
                mx = a[0];
                for (int i = 1; i < n; i++) {
                    mx = max(mx, a[i]);
                    if (mx == a[k]) {
                        cnt2++;
                    }
                }
                out.println(max(cnt2, cnt1));
                continue;
            }
            if (mci > k) {
                swap(a, 0, k);
                k = 0;
                int mx = a[0], cnt = 0;
                for (int i = 1; i < n; i++) {
                    mx = max(mx, a[i]);
                    if (mx == a[k]) {
                        cnt++;
                    }
                }
                out.println(cnt);
                continue;
            }

        }

        out.flush();
        out.close();
        br.close();
    }
    
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}