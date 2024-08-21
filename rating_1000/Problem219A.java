import java.util.*;

public class Problem219A {
    static int k;
    static String s;
    static Map<Character, Integer> map;

    public static void solve(Scanner sc) {
        k = sc.nextInt();
        s = sc.next();
        map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character key : map.keySet()) {
            if (map.get(key) % k != 0) {
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sub = new StringBuilder();
        for (char c : map.keySet()) {
            if (map.get(c) % k != 0) {
                System.out.println(-1);
                sc.close();
                return;
            }
            for (int i = 0; i < map.get(c) / k; i++) {
                sub.append(c);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            res.append(sub);
        }

        System.out.println(res.toString());
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