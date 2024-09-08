import java.util.*;

public class Problem1536B {
    static int n;
    static String s;

    public static void solve(Scanner sc) {
        n = sc.nextInt();
        s = sc.next();
        var map = new TreeMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String temp = "";
            temp += s.charAt(i);
            map.put(temp, 1);
        }

        for (int i = 0; i < n - 1; i++) {
            String temp = s.substring(i, i + 2);
            map.put(temp, 1);
        }
        for (int i = 0; i < n - 2; i++) {
            String temp = s.substring(i, i + 3);
            map.put(temp, 1);
        }

        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            String temp = "";
            temp += ch1;
            if (!map.containsKey(temp)) {
                System.out.println(temp);
                return;
            }
        }
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            for (char ch2 = 'a'; ch2 <= 'z'; ch2++) {
                String temp = "";
                temp += ch1 + "" + ch2 + "";
                if (!map.containsKey(temp)) {
                    System.out.println(temp);
                    return;
                }
            }
        }
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            for (char ch2 = 'a'; ch2 <= 'z'; ch2++) {
                for (char ch3 = 'a'; ch3 <= 'z'; ch3++) {
                    String temp = "";
                    temp += ch1 + "" + ch2 + "" + ch3 + "";
                    if (!map.containsKey(temp)) {
                        System.out.println(temp);
                        return;
                    }
                }
            }
        }

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