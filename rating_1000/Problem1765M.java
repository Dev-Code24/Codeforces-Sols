import java.util.*;

/*
 * if a divides n then, n/a also divides n
 * and going from 2 to root n, we can efficiently find the answer
 */
public class Problem1765M {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        int a = 1;
        for (int g = 2; g * g <= n; ++g) {
            if (n % g == 0) {
                a = n / g;
                break;
            }
        }

        System.out.println(a + " " + (n - a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    // private static int gcd(int a, int b) {
    // while (b != 0) {
    // int temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // private static int lcm(int a, int b) {
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