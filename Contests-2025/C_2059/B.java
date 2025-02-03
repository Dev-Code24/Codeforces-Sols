import java.io.*;
import java.util.*;


import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class B {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken()), k = parseInt(nextToken());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());
            if(k == n) {
                int j = 1;
                for(int i = 2; i <= n; i += 2) {
                    if(a[i - 1] != j) break;
                    j++;
                }
                out.println(j);
            }else {
                int f = -1;
                for(int i = 1; i <= n - k + 1; i++) {
                    if(a[i] != 1) {
                        f = 1;
                        break;
                    }
                }
                if(f == 1) {
                    out.println(1);
                }else {
                    out.println(2);
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