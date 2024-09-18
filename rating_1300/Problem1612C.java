import java.util.*;

public class Problem1612C {
    static long k;
    static long x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            k = sc.nextInt();
            x = sc.nextLong();
            if (k * k < x) {
                System.out.println(2 * k - 1);
            } else {
                long low = 1, high = 2 * k - 1;
                long ans = 2 * k - 1;
                while (low <= high) {
                    long mid = low + (high - low) / 2;
                    long messages = 0;
                    if (mid >= k) {
                        messages += (k * (k + 1) >> 1) + (k * (k - 1) >> 1);
                        messages -= (2 * k - 1 - mid) * (2 * k - mid) >> 1;
                    } else {
                        messages = (mid) * (mid + 1) >> 1;
                    }

                    if (messages >= x) {
                        ans = mid;
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                System.out.println(ans);
            }
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