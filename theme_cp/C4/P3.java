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
        int n = parseInt(nextToken());
        String s = nextToken();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                StringBuilder temp = new StringBuilder(sb.substring(0, i));
                temp.reverse();
                for (int j = 0; j < i; j++) {
                    sb.setCharAt(j, temp.charAt(j));
                }
            }
        }

        out.println(sb.toString());
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