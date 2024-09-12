import java.util.*;

public class Problem1881D {
    static int n;
    static int a[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        Map<Integer, Integer> divs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            addDivisors(a[i], divs);
        }
        // Check if all prime factor counts are divisible by n
        for (Map.Entry<Integer, Integer> e : divs.entrySet()) {
            if (e.getValue() % n != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    private static void addDivisors(int x, Map<Integer, Integer> divs) {
        int i = 2;
        while (i * i <= x) {
            while (x % i == 0) {
                divs.put(i, divs.getOrDefault(i, 0) + 1);
                x /= i;
            }
            i++;
        }
        if (x > 1) {
            divs.put(x, divs.getOrDefault(x, 0) + 1);
        }
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