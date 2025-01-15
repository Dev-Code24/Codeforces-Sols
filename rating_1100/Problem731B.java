import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem731B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = parseInt(nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = parseInt(nextToken());

        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                if(a[i] >= 0)
                    continue;
                else {
                    ok = false;
                    break;
                }
            } else {
                if(a[i] > 0) {
                    a[i]--;
                }else {
                    ok = false;
                    break;
                }
                if (i + 1 < n) {
                    a[i + 1]--;
                } else {
                    ok = false;
                    break;
                }
            }
        }

        if (!ok) {
            out.println("NO");
        } else {
            out.println("YES");
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