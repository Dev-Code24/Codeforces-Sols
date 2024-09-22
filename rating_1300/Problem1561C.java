import java.util.*;

public class Problem1561C {
    static int n;
    static List<Pair> pws;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            n = sc.nextInt();
            pws = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                int pw = 1;

                for (int j = 0; j < k; j++) {
                    int a = sc.nextInt();
                    pw = Math.max(pw, a - j + 1);
                }

                pws.add(new Pair(pw, k));
            }

            Collections.sort(pws);

            long pw = 0;
            long agg = 0;

            for (Pair pair : pws) {
                long b = pair.first;
                long k = pair.second;

                if (pw < b) {
                    agg += b - pw;
                    pw = b;
                }
                pw += k;
            }

            System.out.println(agg);
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
        long first;
        long second;

        Pair(long _first, long _second) {
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

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}