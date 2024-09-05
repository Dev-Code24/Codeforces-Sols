import java.util.*;

public class Problem1742E {
    static int n, q;
    static long pref[];
    static int prefmax[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        q = sc.nextInt();

        pref = new long[n + 1];
        prefmax = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            pref[i + 1] = pref[i] + a;
            if (i == 0) {
                prefmax[i] = a;
            } else {
                prefmax[i] = Math.max(prefmax[i - 1], a);
            }
        }

        for (int i = 0; i < q; i++) {
            int k = sc.nextInt();
            int idx = upper_bound(prefmax, k);
            System.out.print(pref[idx] + " ");
        }
        
        System.err.println();

    }

    private static int upper_bound(int arr[], int key) {
        int ans = arr.length;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > key) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
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
        int value;
        int index;

        Pair(int _first, int _second) {
            this.value = _first;
            this.index = _second;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.value, o.value);
        }

        @Override
        public String toString() {
            return "(" + value + ',' + index + ")";
        }
    }
}