import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1657C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int n = parseInt(nextToken());
        char s[] = nextToken().toCharArray();

        int l = 0;
        int cnt = 0;
        while(l + 1 < n) {
            if(s[l] == '(' || (s[l] == ')' && s[l + 1] == ')')) l += 2;
            else {
                int r = l + 1;
                while(r < n && s[r] != ')') r++;
                if(r == n) break;
                l = r + 1;
            }
            cnt++;
        }

        out.println(cnt + " " + (n - l));
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) solve();
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

//     static long gcd(long a, long b) {
//         while (b != 0) {
//             long temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//
//     static long lcm(long a, long b) {
//         return a * b / gcd(a, b);
//     }
//
//     static class Pair implements Comparable<Pair> {
//         long first;
//         long second;
//
//         Pair() {
//             this.first = 0L;
//             this.second = 0L;
//         }
//
//         Pair(long _first, long _second) {
//             this.first = _first;
//             this.second = _second;
//         }
//         @Override
//         public int compareTo(Pair o) {
//             if (this.first != o.first) {
//                 return Long.compare(this.first, o.first);
//             }
//             return Long.compare(this.second, o.second);
//         }
//         @Override
//         public String toString() {
//             return "(" + first + ',' + second + ")";
//         }
//         @Override
//         public boolean equals(Object o) {
//             if (this == o)
//                 return true;
//             if (o == null || getClass() != o.getClass())
//                 return false;
//             Pair pair = (Pair) o;
//             return first == pair.first && second == pair.second;
//         }
//         @Override
//         public int hashCode() {
//             return Objects.hash(first, second);
//         }
//     }
}