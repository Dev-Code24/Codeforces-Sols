import java.util.*;

public class Problem1725B {
    static int n;
    static long d;
    static List<Long> a;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        d = sc.nextInt();
        a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        // make subsequences such that the (max el)*subs.length > d
        Collections.sort(a);

        int i = 0;
        int j =  n - 1;
        int count = 0;

        while (i <= j) {
            long sum = a.get(j);
            while (sum <= d && i < j) {
                a.set(i, a.get(j));
                sum += a.get(i);
                i++;
            }
            j--;
            if (sum > d) {
                count++;
            }
        }
        System.out.println(count);

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