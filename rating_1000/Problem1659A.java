import java.util.*;

public class Problem1659A {
    static int n, r, b;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        r = sc.nextInt();
        b = sc.nextInt();
        // b < r strict
        int p = r % (b + 1);
        String y = "R".repeat(r / (b + 1));
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < b + 1; i++) {
            if (i > 0) {
                ans.append("B");
            }
            ans.append(y);
            if (p > 0) {
                ans.append("R");
                p--;
            }
        }

        System.out.println(ans.toString());
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

// RBRBRBRBRBR
// RBRBRBRBRBR
// RRRRRBRRRR
// RRRBRRRBRR
// RRRBRRRBRRR