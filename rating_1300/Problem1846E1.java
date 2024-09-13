import java.util.*;

// Choose my own k and check if with that k, check if a snowflake can be made 
// with the given n
public class Problem1846E1 {
    static long n;
    static Set<Long> nums;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        if (nums.contains(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {
        nums = new HashSet<>();

        for (long k = 2; k <= 1000; ++k) {
            long val = 1 + k;
            long p = k * k;
            for (int cnt = 2; cnt <= 20; ++cnt) {
                val += p;
                if (val > 1000000)
                    break;
                nums.add(val);
                p *= k;
            }
        }

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
