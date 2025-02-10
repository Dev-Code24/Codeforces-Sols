import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1681C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        int a[] = new int[n], A[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = parseInt(nextToken());
            A[i] = a[i];
        }
        int b[] = new int[n], B[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = parseInt(nextToken());
            B[i] = b[i];
        }

        Arrays.sort(A);
        Arrays.sort(B);

        var bool = true;
        var list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            if (a[i] == A[i] && b[i] == B[i]) continue;

            for (int j = i + 1; j < n; j++) {
                if (a[j] == A[i] && b[j] == B[i]) {
                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];

                    b[i] = b[i] ^ b[j];
                    b[j] = b[i] ^ b[j];
                    b[i] = b[i] ^ b[j];
                    var tmp = new ArrayList<Integer>();
                    tmp.add(i + 1);
                    tmp.add(j + 1);
                    list.add(tmp);
                }
            }

            if (a[i] != A[i] || b[i] != B[i]) {
                bool = false;
                break;
            }
        }

        if(!bool) out.println(-1);
        else {
            out.println(list.size());
            for (var tmp : list) out.println(tmp.get(0) + " " + tmp.get(1));
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