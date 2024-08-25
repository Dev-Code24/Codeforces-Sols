import java.util.*;

public class Problem507A {
    static int n, k; // number of instruments and number of days respectively

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        Pair aasc[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            aasc[i] = new Pair(a, i + 1);
        }
        Arrays.sort(aasc);
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (k > 0 && i < n) {
            k -= aasc[i].first;
            if (k >= 0) {
                res.add(aasc[i].second);
                i++;
            }
        }
        if (i == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(res);
        System.out.println(res.size());
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
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

    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int _first, int _second) {
            this.first = _first;
            this.second = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.first, o.first);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }
    }
}