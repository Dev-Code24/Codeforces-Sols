import java.util.*;

/*
 * This is a simple max heap problem, just to avoid TLE, some measures were taken
 */
public class Problem1849B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.first != p2.first) {
                    return Integer.compare(p2.first, p1.first);
                } else {
                    return Integer.compare(p1.second, p2.second);
                }
            }
        });
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() % k; // to avoid TLE
            if (a == 0) // to avoid TLE
                a = k; // to avoid TLE
            pq.offer(new Pair(a, i + 1)); // pair.first = healthValue, pair.second = index
        }

        int a[] = new int[n];
        int i = 0;
        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            a[i] = top.second;
            System.out.print(a[i++] + " ");
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
    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int _first, int _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.first, o.first);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }
    }
}