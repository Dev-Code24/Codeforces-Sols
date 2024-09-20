import java.util.*;

public class Problem1601A {
    static int n, a[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            n = sc.nextInt();
            a = new int[n];
            int cnt[] = new int[32];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                for (int j = 0; j < 32; j++) {
                    if ((a[i] & (1 << j)) != 0) {
                        cnt[j]++;
                    }
                }
            }

            for (int k = 1; k <= n; k++) {
                boolean flag = true;
                for (int i = 0; i < 32; i++) {
                    if (cnt[i] % k != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(k + " ");
                    flag = false;
                }
            }
            System.out.println();
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