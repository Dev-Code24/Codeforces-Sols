import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P4 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = parseInt(nextToken()), k = parseInt(nextToken());
        double s = 0;
        for (int i = 0; i < n; i++) {
            int x = parseInt(nextToken());
            s += x;
        }
        double avg = Math.round(s / (double) n);
        int ans = 0;
        while (avg < k) {
            n++;
            s += k;
            avg = Math.round(s / n);
            ans++;
        }

        out.println(ans);

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