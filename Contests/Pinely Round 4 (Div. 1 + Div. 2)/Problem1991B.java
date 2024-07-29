import java.util.*;

/*
 * construct an array 𝑎
 using the formula 𝑎𝑖=𝑏𝑖−1|𝑏𝑖 (assuming 𝑏0 and 𝑏𝑛 are 0). We then verify the condition 
 𝑏𝑖=𝑎𝑖&𝑎𝑖+1 for 1≤𝑖<𝑛 . If any condition fails, then such an array 𝑎 does not exist.
 */
public class Problem1991B {
    static int n;
    static int b[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        b = new int[n + 1];
        for (int i = 1; i < n; i++) {
            b[i] = sc.nextInt();
        }
        b[0] = b[n] = 0;
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = b[i - 1] | b[i];
        }
        boolean valid = true;
        for (int i = 1; i < n; i++) {
            if ((a[i] & a[i + 1]) != b[i]) {
                valid = false;
                break;
            }
        }
        if (valid) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
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