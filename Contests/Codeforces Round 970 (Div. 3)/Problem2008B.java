import java.util.*;

public class Problem2008B {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();
        int cnt1 = 0;
        int cnt0 = 0;

        int temp = (int) Math.sqrt(n);
        if (temp * temp != n) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                cnt1++;
            else
                cnt0++;
        }
        if (cnt1 != (4 * (temp - 1)) || cnt1 + cnt0 != n) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < temp; i++) {
            for (int j = 0; j < temp; j++) {
                char current = s.charAt(i * temp + j);
                if (i == 0 || i == temp - 1 || j == 0 || j == temp - 1) {
                    if (current != '1') {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    if (current != '0') {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");

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