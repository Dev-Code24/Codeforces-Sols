import java.util.*;

public class Problem977F {
    static int n;
    static long a[];
    static long ans = 0, curr = 0;

    public static void solution(Scanner sc) {
        n = sc.nextInt();
        a = new long[n];
        Map<Long, Long> dp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            dp.put(a[i], dp.getOrDefault(a[i] - 1, 0l) + 1);
            if (dp.get(a[i]) > ans) {
                ans = dp.get(a[i]);
                curr = a[i];
            }
        }

        System.out.println(ans);
        List<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == curr) {
                curr--;
                list.add(i + 1);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc);
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