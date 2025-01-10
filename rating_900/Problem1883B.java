import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1883B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            char s[] = nextToken().toCharArray();

            int arr[] = new int[26];
            for (int i = 0; i < n; i++)
                arr[s[i] - 'a']++;

            int cnt = 0;
            for (int e : arr)
                if ((e & 1) == 1)
                    cnt++;

            if (cnt > k + 1) {
                out.println("NO");
            } else {
                out.println("YES");
            }
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