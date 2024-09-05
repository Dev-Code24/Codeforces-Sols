import java.util.*;

// A really nice problem
public class Problem1656B {
    static int n, k;
    static long a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(a[0] == k ? "YES" : "NO");
        } else {

            Arrays.sort(a);
            int i = 0;
            int j = 1;

            while (j < n && i < n) {
                if (a[i] + Math.abs(k) == a[j]) {
                    System.out.println("YES");
                    return;
                } else if (a[i] + Math.abs(k) < a[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    // private static long gcd(long a, long b) {
    // while (b != 0) {
    // long temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static long lcm(long a, long b) {
    // return a * b / gcd(a, b);
    // }

    // static class Pair implements Comparable<Pair> {
    // long first;
    // long second;
    //
    // Pair(long _first, long _second) {
    // this.first = _first;
    // this.second = _second;
    // }
    // @Override
    // public int compareTo(Pair o) {
    // return Long.compare(this.first, o.first);
    // }
    // @Override
    // public String toString() {
    // return "(" + first + ',' + second + ")";
    // }
    // }
}

// 4  2  2   7
// a1 a2 a3 a4
// a1-a3 a2-a3 a4-a3
// a2-a3-(a1-a3) a4-a3-(a1-a3) ---> a2-a1  a4-a1
// a4-a1-(a2-a1) --> a4-a2