import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Integer.parseInt;
 import static java.lang.Math.abs;

public class Problem1792B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int a[] = new int[5];
            for(int i = 1; i <= 4; i++) a[i] = parseInt(nextToken());

            if(a[1] == 0) {
                out.println(1);
            }else {
                out.println(a[1] + min(a[2],a[3]) * 2 + min(a[1] + 1, abs(a[3] - a[2]) + a[4]));
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