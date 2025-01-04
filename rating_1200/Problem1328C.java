import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1328C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            char c[] = nextToken().toCharArray();

            char a[] = new char[n], b[] = new char[n];
            boolean f = false;
            for (int i = 0; i < n; i++) {
                if (c[i] == '2') {
                    if (f) {
                        a[i] = '2';
                        b[i] = '0';
                    } else {
                        a[i] = '1';
                        b[i] = '1';
                    }
                } else if (c[i] == '1') {
                    a[i] = '1';
                    b[i] = '0';
                    if (!f) {
                        f = true;
                        char temp[] = Arrays.copyOf(a, n);
                        a = Arrays.copyOf(b, n);
                        b = Arrays.copyOf(temp, n);
                    }
                } else {
                    a[i] = '0';
                    b[i] = '0';
                }
            }

            out.println(new String(a));
            out.println(new String(b));
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