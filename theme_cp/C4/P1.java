import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P1 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(nextToken());
                sum += a[i];
            }
            int k = 0;

            if (sum % n != 0) {
                k = -1;
            } else {
                int mnc = sum / n;
                for (int i = 0; i < n; i++) {
                    if (a[i] > mnc) {
                        k++;
                    }
                }
            }
            out.println(k);
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