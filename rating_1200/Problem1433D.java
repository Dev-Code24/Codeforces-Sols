import java.util.*;

public class Problem1433D {
    static int n, a[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            List<List<Integer>> res = new ArrayList<>();
            int idx = -1;
            for (int i = 1; i < n; ++i) {
                if (a[i] != a[0]) {
                    idx = i;
                    res.add(Arrays.asList(1, i + 1));
                }
            }
            if (idx == -1) {
                System.out.println("NO");
                continue;
            }

            for (int i = 1; i < n; ++i) {
                if (a[i] == a[0]) {
                    res.add(Arrays.asList(idx + 1, i + 1));
                }
            }

            System.out.println("YES");
            for (var pair : res) {
                System.out.println(pair.get(0) + " " + pair.get(1));
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