import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
 import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1881B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    // Avoid Map for frequency based operations, instead use Arrays for significant improvement in Time Complexity

    static void solve() throws IOException {
        int val[] = new int[3];
        for (int i = 0; i < 3; i++) val[i] = parseInt(nextToken());
        if (val[0] == val[1] && val[1] == val[2]) {
            out.println("YES");
            return;
        }

        Arrays.sort(val);

        if(val[1] % val[0] == 0 && val[2] % val[0] == 0 && ((val[1]/val[0]) - 1 + (val[2]/val[0]) - 1) <= 3) {
            out.println("YES");
            return;
        }

        out.println("NO");
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