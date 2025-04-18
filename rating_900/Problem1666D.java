import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1666D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            char s[] = nextToken().toCharArray();
            char t[] = nextToken().toCharArray();
            int n = s.length, m = t.length;

            int sa[] = new int[26], ta[] = new int[26];
            for(char c : s) sa[c - 'A']++;
            for(char c : t) ta[c - 'A']++;

            int i = 0, j = 0;
            while(i < n && j < m) {
                if(s[i] == t[j]) {
                    if(sa[s[i] - 'A'] == ta[t[j] - 'A']) {
                        ta[t[j] - 'A']--;
                        j++;
                    }
                }
                sa[s[i] - 'A']--;
                i++;
            }
            out.println(j == m ? "YES" : "NO");
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