import java.io.*;
import java.util.*;

 import static java.lang.Math.max;
import static java.lang.Integer.parseInt;
// import static java.lang.Math.min;
 import static java.lang.Math.abs;

public class C {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static void reverse(int arr[]) {
        var a = new ArrayList<Integer>(arr.length);
        for (int i : arr) a.add(i);
        Collections.reverse(a);
        for (int i = 0; i < arr.length; i++) arr[i] = a.get(i);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());
        while (TC-- > 0) {
            int n = parseInt(nextToken());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = parseInt(nextToken());

            if (n == 1) {
                out.println(Arrays.stream(a).sum());
            } else {
                int ans = Arrays.stream(a).sum();
                while(a.length != 1) {
                    int b[] = new int[a.length - 1];
                    for(int i = 0; i < a.length - 1; i++) {
                        b[i] = a[i + 1] - a[i];
                    }
                    a = Arrays.copyOf(b,b.length);
                    ans = max(ans,abs(Arrays.stream(a).sum()));
                }
                out.println(max(a[0],ans));
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