import java.util.*;

public class Problem1199A {
    static int n, x, y;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; ++i) {
            int leftMin = Integer.MAX_VALUE, rightMin = Integer.MAX_VALUE;

            for (int right = i + 1; right <= i + y; right++) {
                if (right > n) {
                    break;
                }
                rightMin = Math.min(rightMin, a[right]);
            }
            if (a[i] > rightMin) {
                continue;
            }

            for (int left = i - x; left <= i - 1; left--) {
                if (left < 1) {
                    break;
                }
                leftMin = Math.min(leftMin, a[left]);
            }

            if (a[i] <= leftMin && a[i] <= rightMin) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
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