import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class P2 {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            char s[] = nextToken().toCharArray();
            if (s[0] < s[2]) {
                if (s[1] == '<') {
                    out.println(s[0] + "" + s[1] + "" + s[2]);
                } else {
                    out.println(s[0] + "<" + s[2]);
                }
            } else if (s[0] > s[2]) {
                if (s[1] == '>') {
                    out.println(s[0] + "" + s[1] + "" + s[2]);
                } else {
                    out.println(s[0] + ">" + s[2]);
                }
            } else {
                if (s[1] == '=') {
                    out.println(s[0] + "" + s[1] + "" + s[2]);
                } else {
                    out.println(s[0] + "=" + s[2]);
                }
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