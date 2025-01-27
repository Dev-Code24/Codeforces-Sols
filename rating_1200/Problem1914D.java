import java.io.*;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Integer.parseInt;

public class Problem1914D {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int[] max_elements(int arr[]) {
        int ret[] = {-1, -1, -1};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (ret[0] == -1 || arr[ret[0]] < arr[i]) {
                ret[2] = ret[1];
                ret[1] = ret[0];
                ret[0] = i;
            } else if (ret[1] == -1 || arr[ret[1]] < arr[i]) {
                ret[2] = ret[1];
                ret[1] = i;
            } else if (ret[2] == -1 || arr[ret[2]] < arr[i]) {
                ret[2] = i;
            }
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n], b[] = new int[n], c[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());
            for (int i = 0; i < n; i++) b[i] = parseInt(nextToken());
            for (int i = 0; i < n; i++) c[i] = parseInt(nextToken());

            int aa[] = max_elements(a);
            int bb[] = max_elements(b);
            int cc[] = max_elements(c);

            int ans = -1;
            for (int i : aa) {
                for (int j : bb) {
                    for (int k : cc) {
                        if (i == j || j == k || k == i) continue;
                        ans = max(ans, a[i] + b[j] + c[k]);
                    }
                }
            }
            out.println(ans);
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