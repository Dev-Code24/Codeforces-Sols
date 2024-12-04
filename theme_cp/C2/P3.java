import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P3 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int p[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = parseInt(nextToken());
            }
            int f = -1;
            for (int i = 0; i + 1 < n; i++) {
                if (p[i] != i + 1) {
                    if (p[i + 1] == i + 1 && p[i] == i + 2) {
                        swap(p, i + 1, i);
                    } else {
                        out.println("NO");
                        f = 1;
                        break;
                    }
                }
            }
            if (f == 1)
                continue;
            out.println("YES");

        }

        out.flush();
        out.close();
        br.close();
    }

    static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}