import java.util.*;

public class Problem2005A {
    static int n;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        char a[] = { 'a', 'e', 'i', 'o', 'u' };

        if (n <= 5) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }

        String ans = "";

        int rep = n / 5; // 2
        int rem = n % 5; // 0
        int remi = 0;
        for (int i = 0; i < n && ans.length() < n; i++) {
            String s = "";
            for (int j = 0; j < rep; j++) {
                s += a[i % 5];
            }
            if (remi < rem) {
                s += a[remi];
                remi++;
            }
            ans += s;
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
    // @Override
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || getClass() != o.getClass())
    // return false;
    // Pair pair = (Pair) o;
    // return first == pair.first && second == pair.second;
    // }
    // @Override
    // public int hashCode() {
    // return Objects.hash(first, second);
    // }
    // }
}