import java.io.*;
import java.util.*;

 import static java.lang.Math.min;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n, l, r, a[];

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            n = parseInt(nextToken());
            l = parseInt(nextToken());
            r = parseInt(nextToken());
            l--;
            r--;
            a = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

            long s1 = 0, s2 = 0;
            ArrayList<Integer> before = new ArrayList<>(), after = new ArrayList<>();

            for (int i = 0; i < l; i++) before.add(a[i]);
            for (int i = r + 1; i < n; i++) after.add(a[i]);

            Arrays.sort(a, l, r + 1);
            Collections.sort(before);
            Collections.sort(after);
            for (int i = 0, j = r; i < before.size() || j >= l; i++, j--) {
                if (i < before.size() && j >= l && before.get(i) < a[j]) {
                    s1 += before.get(i);
                } else {
                    if(j >= l) s1 += a[j];
                }
            }
            for (int i = 0, j = r; i < after.size() || j >= l; i++, j--) {
                if (i < after.size() && j >= l && after.get(i) < a[j]) {
                    s2 += after.get(i);
                } else {
                    if(j >= l) s2 += a[j];
                }
            }

            out.println(min(s1, s2));


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