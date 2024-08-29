import java.util.*;
public class Problem1821B {
    static int n;
    static int a[], b[];
    static int left, right;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        left = 0;
        right = n - 1;

        while (a[left] == b[left]) {
            left++;
        }
        while (a[right] == b[right]) {
            right--;
        }
        while (left > 0 && b[left - 1] <= b[left]) {
            left--;
        }
        while (right < n - 1 && b[right + 1] >= b[right]) {
            right++;
        }
        System.out.println((left + 1) + " " + (right + 1));
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