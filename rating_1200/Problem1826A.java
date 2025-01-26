import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
// import static java.lang.Math.max;
// import static java.lang.Math.abs;

public class Problem1826A {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
           var n = parseInt(nextToken());
           int l[] = new int[n];
           for(var i = 0; i < n; i++) l[i] = parseInt(nextToken());
           var b = false;
           for(var liars = 0; liars <= n; liars++) {
                var actual = 0;
                for( var el : l) {
                    if(el > liars) actual++;
                }
                if(actual == liars) {
                    out.println(actual);
                    b = true;
                    break;
                }
            }
           if(!b){
               out.println(-1);
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