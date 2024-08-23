import java.util.*;

public class Problem1614B {
    static int n;
    static int a[];
    static long x[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        x = new long[n + 1];
        Pair aDesc[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            aDesc[i] = new Pair(a[i], i);
        }
        Arrays.sort(aDesc);

        long coordinate = 1;
        long T = 0;
        // being a little bit extra smart to minimise the use of a set
        // to store if a coordinate is used or not, we make sure the 
        // coordinates are used alternately, for even positions +coordinate
        // and for odd positions -coordinate
        for (int i = 0; i < n; i++) {
            int numofVisits = aDesc[i].first;
            int index = aDesc[i].second;

            if (i % 2 == 0) {
                x[index + 1] = coordinate;
            } else {
                x[index + 1] = -coordinate;
                coordinate++;
            }
            T += numofVisits * 2 * Math.abs(x[index + 1]);
        }

        System.out.println(T);
        for (int i = 0; i < n + 1; i++) {
            System.out.print(x[i] + " ");
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
            return Long.compare(o.first, this.first);
        }

        @Override
        public String toString() {
            return "(" + first + ',' + second + ")";
        }
    }
}
