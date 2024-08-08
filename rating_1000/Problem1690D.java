import java.util.*;

public class Problem1690D {
    static int n, k;
    static char arr[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        arr = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 'W') {
                count++;
            }
        }
        int ans = count;
        for (int i = k; i < n; i++) {
            if (arr[i] == 'W') {
                count++;
            }
            if (arr[i - k] == 'W') {
                count--;
            }
            ans = Math.min(ans, count);
        }

        System.out.println(ans);
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