import java.util.*;
// Do this again 
public class Problem1904B {
    static int n;
    static int ans[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        Arrays.sort(b);

        long sum = 0;
        var list = new ArrayList<Integer>();
        // list contains those element's indexes which cannot be removed
        // even after adding up all the previous smaller elements
        for (int i = 0; i + 1 < n; i++) {
            sum += b[i];
            if (sum < b[i + 1])
                list.add(i);
        }
        list.add(n - 1);

        var map = new HashMap<Integer,Integer>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i <= list.get(k))
                map.put(b[i], list.get(k));
            else {
                k++;
                map.put(b[i], list.get(k));
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(map.get(a[i]) + " ");
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
        long first;
        int second;

        Pair(long _first, int _second) {
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