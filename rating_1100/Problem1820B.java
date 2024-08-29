import java.util.*;

// look at the editorial for the solution
// use this proof for the solution: https://www.youtube.com/watch?v=us6QZinhT60
public class Problem1820B {
    static String s;

    public static void solve(Scanner sc) {
        s = sc.next();
        long n = s.length();
        boolean has0 = false;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                has0 = true;
                break;
            }
        }
        s += s;
        if (!has0) {
            System.out.println(n * n);
            return;
        }
        long maxCnt = 0;
        long now = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                now = 0;
            } else {
                now++;
                maxCnt = Math.max(maxCnt, now);
            }
        }

        System.out.println((maxCnt / 2 + 1) * ((maxCnt + 1) / 2));

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

/*
 * [1, 0, 1]
 * [0, 1, 1]
 * [1, 1, 0]
 */