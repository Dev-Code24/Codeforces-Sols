import java.util.*;

public class Problem1857D {
    static int n;
    static long a[], b[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new long[n];
        b = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        var mp = new HashMap<Long, ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            var list = mp.getOrDefault(a[i] - b[i], new ArrayList<Integer>());
            list.add(i);
            mp.put(a[i] - b[i], list);
        }

        long maxi = Long.MIN_VALUE;
        for (var el : mp.keySet()) {
            maxi = Math.max(maxi, el);
        }
        System.out.println(mp.get(maxi).size());
        for (var el : mp.get(maxi)) {
            System.out.print((el + 1) + " ");
        }
        System.out.println();

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

// 3
// 0 2 1
// 1 3 2
// ai - aj >= bi - bj
// => ai - bi >= aj - bj
// if i store ai - bi in a map

// map
// a0 - b0 -> -1
// a1 - b1 -> -1
// a2 - b2 -> -1