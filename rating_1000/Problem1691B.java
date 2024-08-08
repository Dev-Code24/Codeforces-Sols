import java.util.*;

public class Problem1691B {
    static int n;
    static int s[];

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        // shoe size >= their own size
        // if an array contains a max el/shoes size then min freq of that el should be 2
        // else return -1

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("-1");
                return;
            }
        }

        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            int a = i + 1;
            while (i + 1 < n && s[i] == s[i + 1]) {
                perm[i] = i + 2;
                i++;
            }
            perm[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(perm[i] + " ");
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
    // }
}